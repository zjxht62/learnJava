package thinkinjava.chapter11_holding;

import java.util.Iterator;

/**
 * 通过实现Iterable接口,使类可以通过foreach语句进行遍历
 *
 * @author trevor.zhao
 * @date 2020/8/19
 */
public class IterableClass implements Iterable<String>{
    protected String[] words = "And that is how we know the Earth to be banana-shaped".split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.println(s + " ");
        }
    }
}
