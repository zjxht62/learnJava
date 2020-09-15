package thinkinjava.chapter14_typeinfo.toys;

/**
 * 泛型的toy类测试
 *
 * @author trevor.zhao
 * @date 2020/9/14
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        //产生具体的类型
        FancyToy fancyToy = ftClass.newInstance();
        //getSuperClass()返回的是基类,并且编译器在编译期就知道它是什么类型了---这个例子里就是Toy.class---而不仅仅只是"某个类,它是FancyToy超类"
        Class<? super FancyToy> up = ftClass.getSuperclass();
        //下面将无法编译
//        Class<Toy> up2 = ftClass.getSuperclass();
        //只能产生Object
        Object obj = up.newInstance();
    }
}
