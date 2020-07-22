package thinkinjava.chapter9_interface.cycles;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/21
 */
public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle makeCycle() {
        return new Bicycle();
    }
}
