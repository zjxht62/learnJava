package thinkinjava.chapter14_typeinfo;

import thinkinjava.chapter14_typeinfo.interfacea.A;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/9/23
 */
class B implements A {
    @Override
    public void f() {

    }
    public void g() {

    }
}
public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        //a.g();
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
}
