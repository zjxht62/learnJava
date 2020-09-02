package thinkinjava.chapter11_holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/4
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }

        for (Integer i : c) {
            System.out.println("i:" + i);
        }
    }
}
