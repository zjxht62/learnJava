package thinkinjava.chapter15_generics;

/**
 * 泛型擦除与继承
 *
 * @author trevor.zhao
 * @date 2020/10/10
 */
class GenericBase<T> {
    private T element;

    public T get() {
        return element;
    }

    public void set(T element) {
        this.element = element;
    }
}

class Derived1<T> extends GenericBase<T> {}

class Derived2 extends GenericBase {}


//class Derived3 extends GenericBase<?> {}
//Strange error:
//unexpected type found : ?
//required: class or interface without bounds
//上面意思是说需要没有边界的原生基类

public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj);


    }
}
