package thinkinjava.chapter9_interface;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/19
 */
public abstract class Base {
    abstract void print();

    public Base() {
        System.out.println("Base constructor");
        print();
    }

    public static void main(String[] args) {
        /*
        1.首先sub的存储被分配而且初始化为0
        2.调用父类base的构造器
        3.子类的print在父类构造器内被调用 此时i为0
        4.sub的成员变量被初始化
        5.调用son的构造器
         */
        Sub sub = new Sub();
        sub.print();

    }
}
