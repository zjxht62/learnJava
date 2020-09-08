package thinkinjava.chapter13_strings;

/**
 * 正则表达式匹配
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}
