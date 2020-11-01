package thinkinjava.chapter18_io;

import java.io.IOException;
import java.io.StringReader;

/**
 * 从内存输入
 *
 * @author trevor.zhao
 * @date 2020/10/29
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("SongList.txt"));
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char)c);
        }
    }
}
