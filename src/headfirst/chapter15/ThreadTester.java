package headfirst.chapter15;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/2
 */
public class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        //将Runnable的实例传给Thread的构造函数
        Thread myThread = new Thread(threadJob);

        myThread.start();
        System.out.println("back in main");
    }
}
