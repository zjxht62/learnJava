package thinkinjava.chapter15_generics;

/**
 * 泛型数组demo
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        //Compiles: produces ClassCastException:
        //! gia = (Generic<Integer>[])new Object[SIZE];

        //运行时类型是raw(erased)类型
        gia = (Generic<Integer>[])new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        //! gia[1] = new Object(); 编译期错误
        //! gia[2] = new Generic<Double>();编译期发现类型不匹配错误
    }
}
