package thinkinjava.chapter9_interface;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/19
 */
public class Sub extends Base {
    private int i = 100;
    @Override
    void print() {
        System.out.println("Sub.print()" + i);
    }
}
