package thinkinjava.chapter15_generics;

/**
 * 包装的泛型数组Demo
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    //public的获取array的方法
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<Integer>(10);
        //下面将产生ClassCastExCeption
        //! Integer[] ia = gai.rep();
        //下面的OK
        Object[] oa = gai.rep();
    }
}
