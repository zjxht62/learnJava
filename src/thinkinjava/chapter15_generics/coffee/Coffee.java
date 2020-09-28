package thinkinjava.chapter15_generics.coffee;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/9/28
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }


}
