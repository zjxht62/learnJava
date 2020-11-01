package thinkinjava.chapter18_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * 缓冲输入文件
 *
 * @author trevor.zhao
 * @date 2020/10/29
 */

public class BufferedInputFile {
    public static String read(String fileName) throws IOException {
        LinkedList<String> resultList = new LinkedList<>();
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
            resultList.addFirst(s);
        }
        in.close();
//        while (!resultList.isEmpty()) {
//            sb.append(resultList.removeFirst() + "\n");
//        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException{
        System.out.println(read("SongList.txt"));

    }
}
