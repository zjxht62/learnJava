package thinkinjava.chapter15_generics;

import thinkinjava.typeinfo.pets.Dog;
import thinkinjava.typeinfo.pets.Pet;

import java.net.HttpRetryException;

/**
 * 泛型方式持有对象
 *
 * @author trevor.zhao
 * @date 2020/9/27
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

//    public static void main(String[] args) {
//        Holder3<AutoMobile> holder3 = new Holder3<>(new AutoMobile());
//        AutoMobile autoMobile = holder3.getA();
//    }
public static void main(String[] args) {
    Holder3<Pet> holder3 = new Holder3<>(new Dog());
    Dog dog = (Dog) holder3.getA();
    System.out.println(dog.toString());
}


}
