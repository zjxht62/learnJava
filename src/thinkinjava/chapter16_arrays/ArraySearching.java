package thinkinjava.chapter16_arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;

/**
 * 在已排序的数组中查找
 *
 * @author trevor.zhao
 * @date 2020/10/15
 */
public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        while (true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            //如果找到
            if (location >= 0) {
                System.out.println("Location of " + r + " is " + location + ", a[" + location + "] = " + a[location]);
                break;
            }
        }
    }
}
