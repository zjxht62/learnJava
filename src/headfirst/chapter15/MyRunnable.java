package headfirst.chapter15;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/2
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();

    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("top o'  the stack");
    }
}
