package thinkinjava.chapter13_strings;

/**
 * 证明String是不可变的
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class Immutable {
    public static String upCase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "hello";
        System.out.println(q);
        String qq = upCase(q);
        System.out.println(qq);
        System.out.println(q);
    }
}
