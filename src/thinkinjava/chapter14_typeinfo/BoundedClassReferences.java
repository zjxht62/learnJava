package thinkinjava.chapter14_typeinfo;

/**
 * 有界限的Class引用
 *
 * @author trevor.zhao
 * @date 2020/9/13
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        //或者任何从Number继承的子类
    }
}
