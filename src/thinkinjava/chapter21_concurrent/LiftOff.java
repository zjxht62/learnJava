package thinkinjava.chapter21_concurrent;

/**
 *  定义任务
 *
 * @author trevor.zhao
 * @date 2020/11/12
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    //类变量 所有实例共有 存储在静态存储区 经常被声明为常量
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown >0 ? countDown : "Liftoff!") + "),";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            //yield()方法是对线程调度器的一种建议,声明:我已经执行完生命周期里最重要的部分了,此刻正是切换给其他任务运行的时机
            Thread.yield();
        }

    }

    public static void main(String[] args) {
    }
}
