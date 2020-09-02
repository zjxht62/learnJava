package thinkinjava.chapter11_holding;

import java.util.Arrays;

/**
 * 数组不是Iterable
 *
 * @author trevor.zhao
 * @date 2020/8/19
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.println(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        //数组可以用foreach遍历 但是不是Iterable
//        test(strings);
        //需要将他转换为Iterable
        test(Arrays.asList(strings));
    }
}
