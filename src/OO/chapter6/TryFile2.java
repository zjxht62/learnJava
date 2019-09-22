package OO.chapter6;

import java.io.File;
import java.util.Date;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/21
 */
public class TryFile2 {
    public static void main(String[] args) {
        File dirObject = new File("E:/zjx/IdeaProjects/against");
        System.out.println(dirObject.getAbsolutePath() + (dirObject.isDirectory() ? "is" : "is not") + " directory");
        System.out.println("The parent of" + dirObject.getName() + "is" + dirObject.getParent());
        File contents[] = dirObject.listFiles();

        if (contents != null) {
            System.out.println("\nThe" + contents.length + "items in the directory" + dirObject.getName() + "are:");
            for (int i = 0; i < contents.length; i++) {
                System.out.println(contents[i] + "is a " + (contents[i].isDirectory() ? "directory" : "file.") + "lastModified" + new Date(contents[i].lastModified()));
            }
        } else {
            System.out.println(dirObject.getName() + "is not a directorys");
        }
    }
}
