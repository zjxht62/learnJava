package thinkinjava.chapter3;
import static net.mindview.util.Print.*;
/**
 * String 操作符
 *
 * @author trevor.zhao
 * @date 2020/6/26
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        print(s + x + y + z);
        print(x + " " + s);
        s += "(summed) = ";
        print(s + (x + y + z));
        print("" + x);


    }
}
