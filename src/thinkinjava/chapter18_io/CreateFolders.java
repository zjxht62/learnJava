package thinkinjava.chapter18_io;

import java.io.*;

/**
 * 创建文件夹
 *
 * @author trevor.zhao
 * @date 2020/11/3
 */
public class CreateFolders {
    public static void main(String[] args) throws IOException {
        String bucketName = "prd-private-bucket";
        BufferedReader reader = new BufferedReader(new FileReader(bucketName + ".txt"));

        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
            String dirPath = "./OSS/"+bucketName+"/" + s;
            File dirFile = new File(dirPath);
            dirFile.mkdirs();
            PrintWriter out = new PrintWriter(dirPath + "readme.md");
            out.write("请上传文件");
            out.close();
//            dirFile.mkdirs();
//            dirFile.

        }

    }
}
