package thinkinjava.chapter18_io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 测试是否结束
 *
 * @author trevor.zhao
 * @date 2020/10/29
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("SongList.txt")));
        while (in.available() != 0) {
            System.out.print((char)in.readByte());
        }
    }
}
