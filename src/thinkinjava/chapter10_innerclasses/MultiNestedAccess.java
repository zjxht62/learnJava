package thinkinjava.chapter10_innerclasses;

import java.nio.channels.ClosedSelectorException;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/28
 */
class MNA {
    private void f() {
        System.out.println("MHA.f()");
    }
    class A {
        private void g() {
            System.out.println("A.g()");
        }
        public class B {
            void h() {
                g();
                h();
            }
        }
    }
}
public class MultiNestedAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
