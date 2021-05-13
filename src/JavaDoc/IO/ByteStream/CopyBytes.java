package JavaDoc.IO.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流，复制xanadu.txt，一次复制一个字节
 *
 * @author trevor.zhao
 * @date 2021/5/10
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;


        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in !=null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
