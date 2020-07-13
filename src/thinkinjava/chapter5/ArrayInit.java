package thinkinjava.chapter5;

import java.util.Arrays;

/**
 * 初始化数组
 *
 * @author trevor.zhao
 * @date 2020/7/7
 */
public class ArrayInit {
    public static void main(String[] args) {
        //在定义的时候初始化，有局限性
        Integer[] a = {
            new Integer(1),
            new Integer(2),
        };
        //可以在任何地方这样初始化
        Integer[] b = new Integer[] {
            new Integer(2),
            new Integer(3),
        };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
