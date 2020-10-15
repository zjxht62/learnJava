package thinkinjava.chapter16_arrays;

import net.mindview.util.Generated;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 实现Comparator来进行数组排序
 *
 * @author trevor.zhao
 * @date 2020/10/15
 */
class CompTypeComparator implements Comparator<CompType> {
    @Override
    public int compare(CompType o1, CompType o2) {
        if (o1.j < o2.j) {
            return -1;
        } else if (o1.j > o2.j) {
            return 1;
        } else {
            return 0;
        }
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], CompType.generator());
        System.out.println("before sorting");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new CompTypeComparator());
        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));

    }
}
