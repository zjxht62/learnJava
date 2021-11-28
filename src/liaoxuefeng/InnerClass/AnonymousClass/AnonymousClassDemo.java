package liaoxuefeng.InnerClass.AnonymousClass;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer("Nested");
        outer.asyncHello();
    }

}
class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    void asyncHello() {
        //定义了一个实现Runnable接口的匿名类，并通过new实例化它
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, " + Outer.this.name);
            }
        };
        new Thread(r).start();
    }
}
