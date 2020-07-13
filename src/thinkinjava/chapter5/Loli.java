package thinkinjava.chapter5;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/4
 */
public class Loli {
    String name;

    Loli() {
        name = "哈哈";
        System.out.println("我是"+name+"我要买裙子");
    }

    Loli(int i) {
        this();
        name = "呵呵";
        System.out.println("我是"+name+"我要买" + i + "条裙子");
    }


    public static void main(String[] args) {
        Loli loli = new Loli();
        Loli loli1 = new Loli(99);
    }
}
