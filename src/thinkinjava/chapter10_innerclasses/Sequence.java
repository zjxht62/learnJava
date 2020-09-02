package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/22
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }

        public Sequence getSequence() {
            return Sequence.this;
        }
    }

    private class ReverseSelector implements Selector {
        private int i = items.length - 1;

        @Override
        public boolean end() {
            return i == 0;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i > 0) i--;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new MyString(Integer.toString(i)));
        }
        Selector selector = sequence.reverseSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
