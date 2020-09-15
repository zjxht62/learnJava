package thinkinjava.chapter14_typeinfo;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * 使用通配符的Class引用
 *
 * @author trevor.zhao
 * @date 2020/9/13
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        //通配符?表示任何事物
        //Class<?> 优于 Class 即使他们是等价的
        //Class不会产生编译器警告信息 Class<?>表示并非是忘写了,而是使用了一个非具体的类引用
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
