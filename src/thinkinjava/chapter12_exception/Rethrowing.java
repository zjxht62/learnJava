package thinkinjava.chapter12_exception;

/**
 * 重新抛出异常
 *
 * @author trevor.zhao
 * @date 2020/8/27
 */
public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("originated the excepion in f()");
        throw new Exception("thrown from f()");
    }
    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            //重新抛出异常printStackTrace()方法显示的还是原来异常抛出点的调用栈信息
            throw e;
        }
    }


    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            //fillInStackTrace方法将返回一个Throwable对象,它是通过吧当前调用栈信息填入原来的异常对象而建立的
            throw (Exception)e.fillInStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            g();
        } catch(Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch(Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
