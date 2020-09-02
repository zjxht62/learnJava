package thinkinjava.chapter12_exception;

/**
 * 自定义异常类
 *
 * @author trevor.zhao
 * @date 2020/8/24
 */
class MyException extends Exception {
    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}
public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }


}
