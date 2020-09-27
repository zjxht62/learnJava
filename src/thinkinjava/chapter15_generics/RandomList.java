package thinkinjava.chapter15_generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/9/27
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);
    public void add(T item) {
        storage.add(item);
    }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : "The quick brown fox jumped over the lazy brown dog".split(" ")) {
            rs.add(s);
        }
        System.out.println(rs.select());
    }
}
