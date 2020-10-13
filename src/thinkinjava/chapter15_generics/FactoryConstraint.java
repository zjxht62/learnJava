package thinkinjava.chapter15_generics;


//使用显示的工厂来创建泛型类型的实例
interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;
    //下面这句是个泛型构造方法，<F extends Factory<T>> 这里是泛型参数列表，表名F是继承自FactoryI<T>
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return new Integer(0);
    }

}



class Widget {
    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }

}
