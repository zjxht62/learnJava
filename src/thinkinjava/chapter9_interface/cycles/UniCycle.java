package thinkinjava.chapter9_interface.cycles;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/21
 */
public class UniCycle implements Cycle {
    @Override
    public void go() {
        System.out.println("我靠一个轮子走");
    }
}
