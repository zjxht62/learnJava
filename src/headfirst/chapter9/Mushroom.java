package headfirst.chapter9;

/**
 * 构造函数的重载
 *
 * @author trevor.zhao
 * @date 2019/8/24
 */
public class Mushroom {
    public Mushroom(int size){}

    public Mushroom() {}

    public Mushroom(boolean isMagic) {}

    public Mushroom(Boolean isMagic) {}

    //下面两个方法因为顺序不同 可以认为是两个不同的含参数的构造方法
    public Mushroom(boolean isMagic, int size) {}

    public Mushroom(int size, boolean isMagic) {}
}
