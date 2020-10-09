package thinkinjava.chapter15_generics;

import net.mindview.util.New;
import thinkinjava.chapter14_typeinfo.Person;
import thinkinjava.chapter14_typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通过类型推断来节省代码
 *
 * @author trevor.zhao
 * @date 2020/10/9
 */
public class SimplePets {
    public static void main(String[] args) {
        //不使用类型推断
        Map<Person, List<? extends Pet>> personListMap = new HashMap<Person, List<? extends Pet>>();
        //使用类型推断
        //类型推断只对赋值操作有效
        //    public static <K, V> Map<K, V> map() {
        //        return new HashMap();
        //    }
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
