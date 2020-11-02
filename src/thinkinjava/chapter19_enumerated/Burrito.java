package thinkinjava.chapter19_enumerated;
import static thinkinjava.chapter19_enumerated.Spiciness.*;
/**
 * 通过静态导入来引用枚举类
 * 墨西哥卷饼
 * @author trevor.zhao
 * @date 2020/11/2
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
}
