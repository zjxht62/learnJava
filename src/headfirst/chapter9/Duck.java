package headfirst.chapter9;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/24
 */
public class Duck {
    //这是个与类同名的方法 但不是构造方法 因为他有返回类型void
    public void Duck() {
        System.out.println("Im a method Quack");
    }

    //无参数的构造方法
    public Duck() {
        System.out.println("Quack");
    }

    //有参数的构造方法
    public Duck(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Quack");
        }
    }
}
