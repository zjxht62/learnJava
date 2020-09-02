package thinkinjava.chapter12_exception;

/**
 * 重新抛出新异常
 *
 * @author trevor.zhao
 * @date 2020/8/27
 */
class OneException extends Exception {
    public OneException(String message) {
        super(message);
    }
}

class TwoException extends Exception {
    public TwoException(String message) {
        super(message);
    }
}
public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("在f()中抛出的异常");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("在内部的try块内捕获,调用printStackTrace");
                e.printStackTrace(System.out);
                throw new TwoException("在内部try块内抛出的TwoException");
            }
        } catch (TwoException e) {
            System.out.println("在外部的try块内捕获,调用printStackTrace");
            e.printStackTrace(System.out);


        }
    }

}
