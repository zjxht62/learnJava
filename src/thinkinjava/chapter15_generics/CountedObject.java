package thinkinjava.chapter15_generics;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/10
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() {
        return id;
    }
    public String toString() {
        return "CountedObject " + id;
    }
}
