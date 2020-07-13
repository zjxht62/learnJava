package thinkinjava.chapter3;
import static net.mindview.util.Print.*;
/**
 * 截尾与舍入
 *
 * @author trevor.zhao
 * @date 2020/6/27
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        print("(int)above:" + (int)above);
        print("(int)below:" + (int)below);
        print("(int)fabove:" + (int)fabove);
        print("(int)fbelow:" + (int)fbelow);

        print("Math.round(above):" + Math.round(above));
        print("Math.round(below):" + Math.round(below));
        print("Math.round(fabove):" + Math.round(fabove));
        print("Math.round(fbelow):" + Math.round(fbelow));
    }
}
