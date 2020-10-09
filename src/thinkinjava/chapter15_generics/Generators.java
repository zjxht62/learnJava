package thinkinjava.chapter15_generics;

import net.mindview.util.Generator;
import thinkinjava.chapter15_generics.coffee.Coffee;
import thinkinjava.chapter15_generics.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/9
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffees) {
            System.out.println(c);
        }

        Collection<Integer> funmbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for (int i : funmbers) {
            System.out.println(i);
        }
    }
}
