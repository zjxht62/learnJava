package thinkinjava.chapter15_generics;

//通过模板方法设计模式来创建泛型对象
abstract class GenericWithCreate<T> {
    final T element;

    public GenericWithCreate() {
        element = create();
    }

    abstract  T create();
}

class X {}
class Creator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
public class CreateGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}
