package thinkinjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * 三元操作符if-else
 *
 * @author trevor.zhao
 * @date 2020/6/25
 */
public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElse(int i) {
        if (i < 10) {
            return i * 100;
        } else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        print(ternary(9));
        print(ternary(10));
        print(standardIfElse(9));
        print(standardIfElse(10));

    }
}
