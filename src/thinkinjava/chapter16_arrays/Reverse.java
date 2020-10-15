package thinkinjava.chapter16_arrays;

import net.mindview.util.Generated;

import java.awt.print.PrinterGraphics;
import java.util.Arrays;
import java.util.Collections;

/**
 * 反转数组，通过Comparator
 *
 * @author trevor.zhao
 * @date 2020/10/15
 */
public class Reverse {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], CompType.generator());
        System.out.println("before sorting");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));
    }
}
