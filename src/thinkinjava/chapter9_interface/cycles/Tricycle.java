package thinkinjava.chapter9_interface.cycles;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/21
 */
public class Tricycle implements Cycle {
    @Override
    public void go() {
        System.out.println("我靠三个轮子走");
    }
    public static CycleFactory getFactory() {
        return new CycleFactory() {
            @Override
            public Cycle makeCycle() {
                return new Tricycle();
            }
        };
    }
}
