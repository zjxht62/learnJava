package thinkinjava.chapter12_exception;

/**
 * @author trevor.zhao
 * @date 2020/6/2
 */
public class Demo5 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            try {
                throw new Exception("haha");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("I'm finally");
            }
            i++;
        }

    }
}
