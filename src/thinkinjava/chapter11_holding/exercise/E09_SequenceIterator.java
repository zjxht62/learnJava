package thinkinjava.chapter11_holding.exercise;
/****************** Exercise 9 ******************
 * Modify innerclasses/Sequence.java so that
 * Sequence works with an Iterator instead of a
 * Selector.
 ***********************************************/

import thinkinjava.chapter10_innerclasses.MyString;
import thinkinjava.chapter10_innerclasses.Parcel1;

import javax.sound.midi.Soundbank;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author trevor.zhao
 * @date 2020/8/12
 */
class Sequence2 {
    private Object[] items;
    private int next;

    public Sequence2(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceIterator implements Iterator<Object> {
        private int i;
        @Override
        public boolean hasNext() {
            return i < items.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return items[i++];
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    public Iterator<Object> iterator() {
        return new SequenceIterator();
    }



}
public class E09_SequenceIterator {
    public static void main(String[] args) {
        Sequence2 sequence = new Sequence2(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new MyString(Integer.toString(i)));
        }
        Iterator<Object> iterator = sequence.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
