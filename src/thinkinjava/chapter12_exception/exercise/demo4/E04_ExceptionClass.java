package thinkinjava.chapter12_exception.exercise.demo4;


/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/2
 */
class MyException extends RuntimeException {
    String exceptionString;
    public MyException(String message) {
        exceptionString = message;
    }
    public void printExceptionString() {
        System.out.println("From printExceptionString():" + exceptionString);
    }
}


public class E04_ExceptionClass {
    public static void main(String[] args) {
        try {
            throw new MyException("自定义异常");
        } catch (MyException e) {
            e.printExceptionString();
        }
    }
}
