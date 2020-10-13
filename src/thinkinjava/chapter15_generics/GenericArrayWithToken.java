package thinkinjava.chapter15_generics;

import java.lang.reflect.Array;

/**
 * 有类型标记的泛型数组
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
public class GenericArrayWithToken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")

    public GenericArrayWithToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithToken<Integer> gai = new GenericArrayWithToken<Integer>(Integer.class, 10);
        Integer[] ia = gai.rep();
    }
}
