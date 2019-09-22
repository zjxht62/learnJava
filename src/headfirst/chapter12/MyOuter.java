package headfirst.chapter12;


/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/30
 */
public class MyOuter {
    private int x;

    //创建内部类实例
    MyInner inner = new MyInner();

    public void doStuff() {
        //调用内部类的方法
        inner.go();
    }


    class MyInner {
        void go() {
            //内部类使用外部类的变量
            x = 42;
        }
    }
}
