package thinkinjava.chapter11_holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * 用foreach迭代Collection
 *
 * @author trevor.zhao
 * @date 2020/8/19
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String s : cs) {
            System.out.print(" '" + s + "' ");

        }
    }
}
