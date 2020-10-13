package thinkinjava.chapter15_generics;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * 泛型,编译器的聪明之处
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
public class ComplierIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple apple = (Apple)flist.get(0);
        System.out.println(flist.contains(new Apple()));//接收Object类型参数
        System.out.println(flist.indexOf(new Apple()));//接收Object类型参数
    }
}
