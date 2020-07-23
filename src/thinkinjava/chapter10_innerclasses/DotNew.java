package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/23
 */
public class DotNew {
    public class Inner {

    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        //创建内部类的对象
        DotNew.Inner inner = dotNew.new Inner();
    }
}
