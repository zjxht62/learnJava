package thinkinjava.chapter18_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/30
 */
public class E21_ToUpperCaseFile {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("haha.txt");
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {
            pw.write(s.toUpperCase());
        }
        pw.close();


    }
}
