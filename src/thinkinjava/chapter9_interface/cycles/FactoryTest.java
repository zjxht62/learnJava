package thinkinjava.chapter9_interface.cycles;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/21
 */
public class FactoryTest {
    public static Cycle getCycleFromFactory(CycleFactory factory) {
        return factory.makeCycle();
    }
    public static void main(String[] args) {
        getCycleFromFactory(new BicycleFactory()).go();
        getCycleFromFactory(new UnicycleFactory()).go();
        getCycleFromFactory(new TricycleFactory()).go();
    }
}
