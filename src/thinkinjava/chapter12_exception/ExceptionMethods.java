package thinkinjava.chapter12_exception;

/**
 * Exception相关方法
 *
 * @author trevor.zhao
 * @date 2020/8/27
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("MyException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.out.println("toString():" + e.toString());
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
