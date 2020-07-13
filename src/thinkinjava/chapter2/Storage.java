package thinkinjava.chapter2;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/20
 */
public class Storage {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.println(storage.storage("haha"));
    }
}
