package OO.chapter7;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/2/11
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<Integer> integerPair = new Pair<>(new Integer(20), new Integer(100));
        Integer value1, value2;
        value1 = integerPair.getFirst();
        value2 = integerPair.getSecond();

        Pair<String> stringPair = new Pair<>("Hello", "World");
        String str1, str2;
        str1 = stringPair.getFirst();
        str2 = stringPair.getSecond();

    }
}
