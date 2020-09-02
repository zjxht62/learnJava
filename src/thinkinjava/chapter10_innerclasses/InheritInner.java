package thinkinjava.chapter10_innerclasses;

/**
 * 内部类的继承
 *
 * @author trevor.zhao
 * @date 2020/8/3
 */
class WithInner {
    class Inner{}
}
//InheritInner类只继承了内部类Inner 但是要生成一个构造器的时候,必须使用如下语法
public class InheritInner extends WithInner.Inner {
    //首先构造器需要传入一个对外部类的引用
    public InheritInner(WithInner wi) {
        //同时调用外部类的构造函数来初始化
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
