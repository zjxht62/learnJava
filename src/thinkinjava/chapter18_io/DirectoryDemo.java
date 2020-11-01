package thinkinjava.chapter18_io;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;
import net.mindview.util.ProcessFiles;

import java.io.File;

/**
 * 目录浏览器的Demo
 *
 * @author trevor.zhao
 * @date 2020/10/29
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        //所有文件夹
        PPrint.pprint(Directory.walk(".").dirs);
        //所有以T开头的java文件
        for (File file : Directory.walk(".", "T.*\\.java")) {
            System.out.println(file);
        }
        System.out.println("----------------------");
    }
}
