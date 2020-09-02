package thinkinjava.chapter12_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 注意构造方法里面的异常
 *
 * @author trevor.zhao
 * @date 2020/9/2
 */
public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            //没有打开文件 所以不用关闭它
            throw e;
        } catch (Exception e) {
            //所有其他的异常都需要关闭文件
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() 不成功");
            }
            throw e;
        }
        finally {

        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() 失败");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e2) {
            throw new RuntimeException("in.close() 失败");
        }
    }
}
