package thinkinjava.chapter12_exception;

/**
 *
 *
 * @author trevor.zhao
 * @date 2020/6/2
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
            int b = a[10];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("I'm finally");
        }
    }
}
