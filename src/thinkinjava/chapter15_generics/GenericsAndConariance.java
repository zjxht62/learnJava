package thinkinjava.chapter15_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型与协变
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
public class GenericsAndConariance {
    public static void main(String[] args) {
        //通配符允许协变
        List<? extends Fruit> flist = new ArrayList<Apple>();
        //编译异常:无法添加任何类型的对象
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Orange());
        flist.add(null);//合法但是没啥用啊
        //我们起码知道返回的是个Fruit
        Fruit f = flist.get(0);
    }
}
