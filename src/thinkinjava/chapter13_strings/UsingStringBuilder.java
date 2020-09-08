package thinkinjava.chapter13_strings;

import java.util.Random;

/**
 * StringBuilder
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class UsingStringBuilder {
    public static Random random = new Random(47);
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(random.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usingStringBuilder = new UsingStringBuilder();
        System.out.println(usingStringBuilder);
    }
}
