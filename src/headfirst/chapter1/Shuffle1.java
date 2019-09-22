package headfirst.chapter1;

import java.security.cert.X509Certificate;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/5/10
 */
public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");

            }

            x = x - 1;
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }


        }
    }
}
