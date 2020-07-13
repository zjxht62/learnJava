package thinkinjava.chapter3;
import static net.mindview.util.Print.*;
/**
 * java对象引用的例子
 *
 * @author trevor.zhao
 * @date 2020/6/20
 */
public class Assignment {
    public static void main(String[] args) {

        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 10;
        t2.level = 20;

        print("1: t1.level:" + t1.level + "t2.level:" + t2.level);
        //将t2的引用给t1，也就是说t1和t2都引用t2
        t1 = t2;
        print("1: t1.level:" + t1.level + "t2.level:" + t2.level);

        t1.level = 99;
        print("1: t1.level:" + t1.level + "t2.level:" + t2.level);

    }
}
