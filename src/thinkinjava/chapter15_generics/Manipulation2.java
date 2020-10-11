package thinkinjava.chapter15_generics;

/**
 * 通过给定泛型边界,告知编译器只能接受遵循这个边界的类型,保证了类型一定具有某个方法
 *
 * @author trevor.zhao
 * @date 2020/10/10
 */
public class Manipulation2<T extends HasF> {
    private T obj;

    public Manipulation2(T obj) {
        this.obj = obj;
    }

    public void manipulate() {
        obj.f();
    }
}

