package thinkinjava.chapter15_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型类型擦除
 *
 * @author trevor.zhao
 * @date 2020/10/10
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
