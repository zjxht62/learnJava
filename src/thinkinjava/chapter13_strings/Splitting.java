package thinkinjava.chapter13_strings;

import java.util.Arrays;

/**
 * 正则表达式分割
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class Splitting {
    public static String knights =
        "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest..." +
            "with... a herring!";
    public static void split(String regex) {
        System.out.println(
            Arrays.toString(knights.split(regex))
        );
    }

    public static void main(String[] args) {
        //按空格分割字符串
        split(" ");
        // \\W表示一个非单词字符 +表示匹配多个 所以将,和空格都匹配出来了,结果里面没有逗号和空格
        split("\\W+");
        // n开头 后面跟着一个或多个非单词字符
        split("n\\W+");

    }

}
