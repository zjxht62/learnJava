package thinkinjava.chapter13_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * matcher的find()方法demo
 *
 * @author trevor.zhao
 * @date 2020/9/8
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();

        int i = 0;
        //find()方法接收一个整数,该整数表示字符串中字符的位置,并以其作为搜索的起点
        while (m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }

    }
}
