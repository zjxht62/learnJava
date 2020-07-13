package thinkinjava.chapter5;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/3
 */
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("overloaded method");
        }
    }
}
