package thinkinjava.chapter3;

/**
 * java表示指数
 *
 * @author trevor.zhao
 * @date 2020/6/25
 */
public class Exponents {
    public static void main(String[] args) {
        //e和E是一样的
        float expfloat = 1.39e-43f;
        expfloat = 1.39E-43f;
        System.out.println(expfloat);
        //java中常将指数作为双精度数（double）处理，所以如果定义为float需要加f
        double expDouble = 47e47d;
        double expDouble2 = 47e47;
        System.out.println(expDouble);
    }
}
