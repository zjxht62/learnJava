package JavaDoc.IO.CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流复制xanadu.txt文件，一次一个字符
 *
 * @author trevor.zhao
 * @date 2021/5/10
 */
public class CopyChararcters {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
