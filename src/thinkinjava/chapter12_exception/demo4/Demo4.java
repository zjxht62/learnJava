package thinkinjava.chapter12_exception.demo4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/2
 */
public class Demo4 {
    public static void main(String[] args) {
        try {
            throw new MyException("自定义异常");
        } catch (MyException e) {
            e.printExceptionString();
        }
    }
}
