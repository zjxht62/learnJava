package thinkinjava.chapter5;

import headfirst.chapter5.GameHelper;

import javax.xml.bind.annotation.W3CDomHandler;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/6
 *
 */
class Window{
    //当window被创建的时候，会打印信息
    public Window(int maker) {
        System.out.println("Window(" + maker +")");
    }
}

class House {
    //构造器之前
    Window w1 = new Window(1);

    public House() {
        System.out.println("House()构造器内");
        //重新初始化w3
        w3 = new Window(33);
    }
    //构造器之后
    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}

public class OrderOfIntialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
//    结果：window对象全都会在调用构造器之前或其他方法之前得到初始化
//    Window(1)
//    Window(2)
//    Window(3)
//    House()构造器内
//    Window(33)
//    f()