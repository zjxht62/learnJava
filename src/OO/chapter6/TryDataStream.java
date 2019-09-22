package OO.chapter6;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/24
 */
public class TryDataStream {
    public static void main(String[] args) {
        int intArray[] = {10, 20, 30, 40, 50, 60};
        float floatArray[] = {11.0f, 22.0f, 33.0f, 44.0f, 55.0f};
        String dirName = "E:/zjx/IdeaProjects";
        try {
            File dir = new File(dirName);
            if (!dir.exists()) {
                dir.mkdir();
            } else if (!dir.isDirectory()) {
                System.out.println(dirName + "不是一个目录");
                return;
            }
            File aFile = new File(dir, "data.txt");
            aFile.createNewFile();

            DataOutputStream myStream = new DataOutputStream(new FileOutputStream(aFile));
            for (int i = 0; i < intArray.length; i++) {
                myStream.writeInt(intArray[i]);
            }
            for (int i = 0; i < floatArray.length; i++) {
                myStream.writeFloat(floatArray[i]);
            }
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
    }
}
