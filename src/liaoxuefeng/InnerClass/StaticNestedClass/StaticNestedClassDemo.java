package liaoxuefeng.InnerClass.StaticNestedClass;

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        Outer.StaticNested sn = new Outer.StaticNested();
        sn.hello();
    }

}

class Outer {
    private static String NAME = "OUTER";
    private String name;

    Outer(String name) {
        this.name = name;
    }

    static class StaticNested {
        void hello() {
            System.out.println("hello, " + Outer.NAME);
        }
    }
}
