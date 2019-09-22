package headfirst.chapter14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/31
 */
public class ReadAFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("MyText.txt");
            //fileReader是连接到文本文件的串流
            FileReader fileReader = new FileReader(myFile);
            //将fileReader连接到BufferedReader以获取更高的效率
            //只会在缓冲区读空了的时候才会去磁盘读取
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            //读到一行就输出一行 直到没有输出为止
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
