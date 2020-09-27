package thinkinjava.chapter15_generics;

/**
 * 只能持有一种对象的类
 *
 * @author trevor.zhao
 * @date 2020/9/27
 */
class AutoMobile{}
public class Holder1 {

    private AutoMobile a;

    public Holder1(AutoMobile a) {
        this.a = a;
    }

    public AutoMobile get() {
        return a;
    }
}
