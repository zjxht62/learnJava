package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/30
 */
class D {}
abstract class E{}
class Z extends D {
    E getE() {
        return new E() {
        };
    }
}
public class MultiImplementation {
    static void handleD(D d) {}
    static void handleE(E e) {}
    public static void main(String[] args) {
        Z z = new Z();
        handleD(z);
        handleE(z.getE());

    }
}
