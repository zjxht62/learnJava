package liaoxuefeng.InnerClass.InnerClass;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer("外部类");
        //内部类的示例不能单独存在，必须依附于一个外部类的实例
        Outer.Inner inner = outer.new Inner();
        inner.hello();
    }
}

/**
 * 外部类
 */
class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    /**
     * 内部类
     */
    class Inner {
        void hello() {
            System.out.println("Hello" + Outer.this.name);
        }

    }
}