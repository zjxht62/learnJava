package thinkinjava.chapter10_innerclasses;

/**
 * 使用带参数的构造器创建匿名内部类
 *
 * @author trevor.zhao
 * @date 2020/7/24
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        //调用父类有参数构造器
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
        System.out.println(w.value());
    }
}
