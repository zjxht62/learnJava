package thinkinjava.chapter18_io;

import java.io.File;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/30
 */
public class MyFileTest {
    public static void main(String[] args) {
        File file = new File("SongList.txt").getAbsoluteFile();
//        File file = new File("SongList.txt");
        System.out.println(file.getPath());
    }
}
