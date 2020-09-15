package thinkinjava.chapter14_typeinfo;

/**
 * 泛型的Class引用
 *
 * @author trevor.zhao
 * @date 2020/9/13
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        //不合法 因为在声明时指定了类型
//        genericIntClass = double.class;
    }
}
