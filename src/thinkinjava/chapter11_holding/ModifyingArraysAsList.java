package thinkinjava.chapter11_holding;

import java.util.*;

/**
 * 打乱Arrays.asList()方法产生的List,那么对底层数组进行修改
 *
 * @author trevor.zhao
 * @date 2020/8/24
 */
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //此处将Arrays.asList的输出给了ArrayList的构造器,将创建一个引用ia元素的ArrayList,对其操作不会影响ia
        List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));
        System.out.println("Before shuffling:" + list1);
        Collections.shuffle(list1, rand);
        System.out.println("After shuffling:" + list1);
        System.out.println("Array:" + Arrays.toString(ia));

        //直接将ia给list,将会影响ia
        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("Before shuffling:" + list2);
        Collections.shuffle(list2, rand);
        System.out.println("After shuffling:" + list2);
        System.out.println("Array:" + Arrays.toString(ia));
    }
}
