package thinkinjava.chapter7.reusing;


//private的方法不是基类接口的一部分。子类虽然有和父类方法签名相同的方法，但是并不是覆盖父类的方法，只是新生成了一个方法而已
import java.awt.print.PrinterGraphics;

import static net.mindview.util.Print.*;

class WithFinals {
    private final void f() {
        print("WithFinals.f()");
    }
    private void g() {
        print("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        print("OverridingPrivate.f()");
    }

    private void g() {
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        print("OverridingPrivate2.f()");
    }
    public void g() {
        print("OverridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion {

    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        //可以向上转型 但是无法调用方法
        OverridingPrivate op = op2;
//        op.f();
//        op.g();
    }
}


