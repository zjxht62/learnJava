package thinkinjava.chapter10_innerclasses;

import javafx.scene.input.Dragboard;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/23
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer() {
            //内部类引用外部类 语法:外部类名字.this
            return DotThis.this;
        }

    }
    public Inner inner() {
        return new Inner();
    }
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
