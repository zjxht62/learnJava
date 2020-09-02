package thinkinjava.chapter10_innerclasses.exercise;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/28
 */
interface WithNested {
    class Nested {
        int i;

        public Nested(int i) {
            this.i = i;
        }

        void f() {
            System.out.println("Nested.f");
        }
    }
}

class B2 implements WithNested {

}


public class E20_InterfaceWithNested {
    public static void main(String[] args) {
        B2 b2 = new B2();
        WithNested.Nested nested = new WithNested.Nested(5);
    }

}
