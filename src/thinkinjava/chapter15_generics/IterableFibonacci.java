package thinkinjava.chapter15_generics;

import java.util.Iterator;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/9/28
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
    private int n;

    public IterableFibonacci(int count) {
        this.n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18)) {
            System.out.println(i + " ");

        }
    }
}