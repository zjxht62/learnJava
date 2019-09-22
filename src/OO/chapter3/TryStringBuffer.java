package OO.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/7
 */
public class TryStringBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n>");
        String line = in.readLine();

        StringBuffer buf = new StringBuffer(line);
        for (int i = 0; i < buf.length(); i++) {
            buf.setCharAt(i, code(buf.charAt(i)));
        }
        System.out.println(buf);
    }

    public static char code(char c) {
        if ((c >= 'A')&&(c <= 'Z')||(c >= 'a')&&(c <= 'z')) {
            c += 13;
        }
        return c;
    }
}
