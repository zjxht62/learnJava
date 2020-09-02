package thinkinjava.chapter10_innerclasses.exercise;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/28
 */
public class E18_NestedClass {
    public static class Nested {
        private String name;

        public Nested(String name) {
            this.name = name;
        }

        public void f() {
            System.out.println("My name is " + name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested("奥森萨芬");
        nested.f();
    }
}
