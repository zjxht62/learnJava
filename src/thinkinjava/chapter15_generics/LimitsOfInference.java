package thinkinjava.chapter15_generics;

import net.mindview.util.New;
import thinkinjava.chapter14_typeinfo.Person;
import thinkinjava.chapter14_typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

/**
 * 泛型 类型推断的限制
 * 类型推断只对赋值有效
 *
 * @author trevor.zhao
 * @date 2020/10/9
 */
public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {
    }
    public static void main(String[] args) {
        //此时不会执行类型推断。这种情况下，编译器认为：调用泛型方法之后，其返回值被赋予一个object类型的变量
        f(New.map());


    }
}
