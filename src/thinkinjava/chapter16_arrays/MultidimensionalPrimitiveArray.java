package thinkinjava.chapter16_arrays;

import java.util.Arrays;

/**
 * 多维数组
 *
 * @author trevor.zhao
 * @date 2020/10/14
 */
public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(a));
    }
}
