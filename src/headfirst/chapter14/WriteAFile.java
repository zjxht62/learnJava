package headfirst.chapter14;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/31
 */
public class WriteAFile {
    public static void main(String[] args) {
        try {
            //如果不存在就会被创建
            FileWriter writer = new FileWriter("Foo.txt");
            //字符串作为参数
            writer.write("Hello Foo!");
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
