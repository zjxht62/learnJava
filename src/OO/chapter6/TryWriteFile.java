package OO.chapter6;

//import com.sun.java.util.jar.pack.Package;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/24
 */
public class TryWriteFile {
    public static void main(String[] args) {
        byte info[] = {12, 34, 56, 76, 89, 54, 28, 90};
        String dirName = "E:/zjx/IdeaProjects";
        String fileName = "test";

        try {
            //创建用于描述路径的对象
            File dirObject = new File(dirName);
            if (!dirObject.exists()) {
                dirObject.mkdir();
            }
            File fileObject = new File(dirObject, fileName);
            fileObject.createNewFile();
            FileOutputStream outputFile = new FileOutputStream(fileObject);
            for (int i = 0; i < info.length; i++) {
                outputFile.write(info[i]);
            }
            outputFile.close();
        } catch (Exception e) {
            System.out.println("IOException" + e + "occurred.");
        }
    }
}
