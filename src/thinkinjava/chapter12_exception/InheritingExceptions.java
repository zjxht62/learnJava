package thinkinjava.chapter12_exception;


/**
 * 自定义异常
 *
 * @author trevor.zhao
 * @date 2020/8/24
 */
class SimpleException extends Exception {

}
public class InheritingExceptions {

    //因为是受检异常,所以必须显式声明throws SimpleException
    public void f() throws SimpleException {
        System.out.println("Throwing SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions inheritingExceptions = new InheritingExceptions();
        try {
            inheritingExceptions.f();
        } catch (SimpleException e) {
            System.out.println("Caught it");
        }
    }
}
