package thinkinjava.chapter15_generics;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
public class Holder<T> {
    private T value;
    public Holder() {}

    public Holder(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<Apple>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);

//        Holder<Fruit> Fruit = Apple;//无法向上转型
        Holder<? extends Fruit> Fruit = Apple;
        Fruit p = Fruit.get();
        d = (Apple)Fruit.get();//返回object

        try {
            Orange c = (Orange)Fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
//        Fruit.set(new Apple());
        System.out.println(Fruit.equals(d));
    }
}
