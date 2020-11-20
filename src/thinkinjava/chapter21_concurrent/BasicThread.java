package thinkinjava.chapter21_concurrent;

/**
 * 用Thread启动liftOff
 *
 * @author trevor.zhao
 * @date 2020/11/12
 */
public class BasicThread {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        //start()方法为该线程执行必须的初始化操作,然后调用Runnable的run()方法
        //此刻start方法很快就返回了,所以先输出了Waiting for Liftoff。因为你时机产生的是对run()方法的调用,然而这个方法还没完成,但是run方法是由不同线程执行的,所以main方法里可以正常执行
        //程序会同时运行两个方法main()和Liftoff.run()
        t.start();
        System.out.println("Waiting for Liftoff");
    }
}
