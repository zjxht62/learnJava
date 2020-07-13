package thinkinjava.chapter3;
import static net.mindview.util.Print.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/24
 */
public class ShortCircuit {
    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("result:" + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        print("test2(" + val + ")");
        print("result:" + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        print("test3(" + val + ")");
        print("result:" + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        //test1(0)返回true test2(2)返回false test3(2)返回false,然而,运行完test(2)不会运行test3(),因为已经可以确定表达式一定返回false了
        boolean b = test1(0) && test2(2) && test3(2);

    }
}
