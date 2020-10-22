package thinkinjava.chapter15_generics;


import java.util.List;

/**
 * super 超类型通配符
 *
 * @author trevor.zhao
 * @date 2020/10/14
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit());

    }
    public static void main(String[] args) {
    }
}
