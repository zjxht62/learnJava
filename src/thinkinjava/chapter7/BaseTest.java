package thinkinjava.chapter7;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/12
 */
public class BaseTest extends BaseClass {
    BaseTest() {
        super(10);
        System.out.println("子类无参数的构造器");
    }

    BaseTest(int i) {
        super(i);
        System.out.println("子类有参数的构造器" + i);
    }

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();
        BaseTest baseTest1 = new BaseTest(2);
    }
}
class BaseClass {
    BaseClass(int i) {
        System.out.println("基类有参数的非默认构造器:" + i);
    }
}
