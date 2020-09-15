package thinkinjava.chapter13_strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 测试split
 *
 * @author trevor.zhao
 * @date 2020/9/9
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        //下面split()里的3指的是将字符串最多分为3份
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));

    }
}
