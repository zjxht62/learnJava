package JavaDoc.IO.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 读取xanadu.txt里面的每个单词，并按每行一个输出
 *
 * @author trevor.zhao
 * @date 2021/5/10
 */
public class ScanXan {
    public static void main(String[] args) throws IOException {
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }

        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
