package thinkinjava.chapter12_exception;

/**
 *
 *
 * @author trevor.zhao
 * @date 2020/6/2
 */
public class Demo2 {
    public static void main(String[] args) {
            Object object = null;
        try {
            object.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("I'm finally");
        }
    }
}
