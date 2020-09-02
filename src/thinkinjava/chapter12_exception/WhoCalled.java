package thinkinjava.chapter12_exception;

/**
 * 异常栈轨迹demo
 *
 * @author trevor.zhao
 * @date 2020/8/27
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            //元素0是栈顶元素,也是调用序列中最后的一个方法调用(Throwable被创建和抛出的地方)
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }
    static void g() {
        f();
    }
    static void h() {
        g();
    }
    public static void main(String[] args) {
        f();
        System.out.println("--------------------------");
        g();
        System.out.println("--------------------------");
        h();
        //先打印出来的是离着调用最近的方法名

    }
}
