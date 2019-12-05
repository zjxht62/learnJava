package corejava1.chapter8.pair1;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/29
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

    public void setFirst(T newValue) {
        this.first = newValue;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T newValue) {
        this.second = newValue;
    }
}
