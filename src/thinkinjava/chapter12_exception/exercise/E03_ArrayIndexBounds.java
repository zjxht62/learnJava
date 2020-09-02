package thinkinjava.chapter12_exception.exercise;

/**
 *
 *
 * @author trevor.zhao
 * @date 2020/6/2
 */
public class E03_ArrayIndexBounds {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
            int b = a[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("I'm finally");
        }
    }
}
