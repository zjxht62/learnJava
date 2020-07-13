package thinkinjava.chapter5;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/6
 */
public class InitTest {
}
class InitClass {
    static String string1 = "string1定义时初始化";
    static String string2;

    static {
        string2 = "string2静态块初始化";
    }

    public static void main(String[] args) {
        System.out.println("打印1" + string1);
        System.out.println("打印2" + string2);
        int[] a = new int[20];
        System.out.println(a.length);

    }
}
