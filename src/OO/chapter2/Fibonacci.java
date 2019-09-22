package OO.chapter2;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2018/12/28
 */
public class Fibonacci {
    public static void main(String[] args) {
        int fib[] = new int[30];
        fibValue(fib);
        displayFib(fib);

    }

    public static void fibValue(int fib[]) {
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
    }

    public static void displayFib(int fib[]) {
        for (int i = 0; i < fib.length; i++) {
            if (i%10 == 0) {
                System.out.println();
            }
            System.out.printf("%8d", fib[i]);
        }
    }
}
