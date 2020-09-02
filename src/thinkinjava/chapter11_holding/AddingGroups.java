package thinkinjava.chapter11_holding;

import java.util.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/4
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        //Collections.addAll方法接收一个Collection对象，以及一个数组或是一个用逗号分隔的列表，将元素添加到collection中
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);

        //下面这句的底层表现仍然是数组,所以无法调整尺寸
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);

    }
}
