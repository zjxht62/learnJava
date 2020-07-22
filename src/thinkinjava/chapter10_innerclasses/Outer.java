package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/22
 */
public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    class Inner{
        @Override
        public String toString() {
            return Outer.this.name;
        }
    }

    Inner getNewInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer("哈哈");
        Outer.Inner inner1 = outer.getNewInner();
        System.out.println(inner1.toString());
    }
}
