package thinkinjava.chapter12_exception.exercise;

/**
 *
 *
 * @author trevor.zhao
 * @date 2020/6/2
 */
public class E01_SimpleException {
    public static void main(String[] args) {
        try {
            String name = "haha";
            throw new Exception(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I'm finally");
        }
    }
}
