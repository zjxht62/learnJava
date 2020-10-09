package thinkinjava.chapter15_generics;

/**
 * 泛型方法
 *
 * @author trevor.zhao
 * @date 2020/10/9
 */
public class GenericMethods {
    //<T>是泛型参数列表  放置于返回值之前
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
