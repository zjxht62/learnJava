package thinkinjava.chapter13_strings;

import thinkinjava.generics.coffee.*;

import java.util.ArrayList;

/**
 * 打印ArrayList
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c : new CoffeeGenerator(10)) {
            coffees.add(c);
        }
        System.out.println(coffees);
    }
}
