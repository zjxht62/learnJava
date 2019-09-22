package OO.chapter6;

import java.io.DataOutput;
import java.io.File;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/21
 */
public class TryFile {
    public static void main(String[] args) {
        File dirObject = new File("e:/javaClass/java/io");
        System.out.println(dirObject + (dirObject.isDirectory() ? "is" : "is not") + " a directory");

        File fileObjetc = new File(dirObject , "File.java");
        System.out.println(fileObjetc + (fileObjetc.exists() ? "does" : "does not") + "exist");

        System.out.println("You Can" + (fileObjetc.canRead() ? "  " : " not") + "read");
        System.out.println("You Can" + (fileObjetc.canWrite() ? "  " : " not") + "write");
    }
}
