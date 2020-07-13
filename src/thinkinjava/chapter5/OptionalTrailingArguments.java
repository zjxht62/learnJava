package thinkinjava.chapter5;

/**
 * 可选参数
 *
 * @author trevor.zhao
 * @date 2020/7/7
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.print("required:" + required + " ");
        for (String s : trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(5);
    }
}
