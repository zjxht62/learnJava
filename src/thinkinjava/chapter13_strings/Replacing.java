package thinkinjava.chapter13_strings;

/**
 * 正则表达式替换
 *
 * @author trevor.zhao
 * @date 2020/9/6
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
