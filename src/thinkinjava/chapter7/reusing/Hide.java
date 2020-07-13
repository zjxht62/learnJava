package thinkinjava.chapter7.reusing;
import static net.mindview.util.Print.*;
/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/13
 */
class Homer {
    char doh(char c) {
        print("doh(char)");
        return 'd';
    }

    float doh(float f) {
        print("doh(float)");
        return f;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh(Milhouse m) {
        print("doh(Milhouse)");
    }
}
//虽然子类重载了父类的方法,但是对父类的方法没有影响依旧可以调用
public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(1.0f);
        bart.doh(new Milhouse());
    }
}
