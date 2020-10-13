package thinkinjava.chapter15_generics;

import OO.chapter7.TryArrayList;

/**
 * 协变的数组
 * 演示数组的一种特殊行为,可以向导出类型的数组赋予基类型的数组引用
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
class Fruit {}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();//ok
        fruits[1] = new Jonathan();//ok
        //运行时类型是Apple[],不是Fruit[]
        try {
            //编译器允许你这样做
            fruits[0] = new Fruit();//ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            //编译器允许你这样做
            fruits[0] = new Orange();//ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
