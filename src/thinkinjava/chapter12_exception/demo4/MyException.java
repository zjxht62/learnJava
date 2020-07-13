package thinkinjava.chapter12_exception.demo4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/2
 */
public class MyException extends RuntimeException {
    String exceptionString;
    public MyException(String message) {
        exceptionString = message;
    }
    public void printExceptionString() {
        System.out.println(exceptionString);
    }
}
