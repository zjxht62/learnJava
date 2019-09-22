package headfirst.chapter1;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/6/11
 */
public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x + y;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
