package thinkinjava.chapter8_polymorphism;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/17
 */
class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
    public void W() {}
}
public class TRRI {
    public static void main(String[] args) {
        Useful[] x = {
            new Useful(),
            new MoreUseful()
        };
        x[0].f();
        x[1].g();
//        找不到方法
//        x[1].u();
        ((MoreUseful)x[1]).u();
//        java.lang.ClassCastException
        ((MoreUseful)x[0]).u();


    }
}
