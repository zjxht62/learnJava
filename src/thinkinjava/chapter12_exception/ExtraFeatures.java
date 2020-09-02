package thinkinjava.chapter12_exception;

/**
 * 自定义异常2
 *
 * @author trevor.zhao
 * @date 2020/8/27
 */
class MyException2 extends Exception {
    //定义了一个变量x
    private int x;

    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }

    //新构造方法
    public MyException2(String message, int x) {
        super(message);
        this.x = x;
    }

    public int val() {
        return x;
    }

    //覆盖getMessage方法,此方法类似于toString()
    @Override
    public String getMessage() {
        return "Detail Message:" + x + " " + super.getMessage();
    }
}

public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println("Throwing Exception form f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Throwing Exception form g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Throwing Exception form h()");
        throw new MyException2("Originated in h()", 666);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val:" + e.val());
        }
    }
}
