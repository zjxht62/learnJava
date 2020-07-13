package thinkinjava.chapter5;

/**
 * 没有默认构造器
 *
 * @author trevor.zhao
 * @date 2020/7/4
 */
class Birda {
    Birda(int i) {}
    Birda(double d) {
    }
}
public class NoSynthesis {
    public static void main(String[] args) {

//        Bird bird0 = new Bird(); 没有默认构造方法，因为已经自定义了构造器
        Birda Birda = new Birda(1);
        Birda Birda1 = new Birda(2.2);
    }
}
