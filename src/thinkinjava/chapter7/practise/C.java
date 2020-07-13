package thinkinjava.chapter7.practise;

import static java.lang.System.out;
/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/10
 */


class A { A(int i){ out.println("A()" + i);} }

class B extends A { B(int i){
    super(i);
    out.println("B()" + i);} }

class C extends A {
    C() {
        super(10);
    }
    B b = new B(5); // will then construct another A and then a B

    public static void main(String[] args) {
        C c = new C(); // will construct an A first
    }
}