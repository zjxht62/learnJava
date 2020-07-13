package thinkinjava.chpter4;

/**
 * 测试while循环
 *
 * @author trevor.zhao
 * @date 2020/6/28
 */
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inisde while");
        }
        System.out.println("Exited while");
    }
}
