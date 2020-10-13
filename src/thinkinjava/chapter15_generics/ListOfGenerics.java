package thinkinjava.chapter15_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 不能创建泛型数组,一般解决方案是在任何想要创建泛型数组的地方都使用ArrayList
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item) {
        array.add(item);
    }
    public T get(int index) {
        return array.get(index);
    }

}
