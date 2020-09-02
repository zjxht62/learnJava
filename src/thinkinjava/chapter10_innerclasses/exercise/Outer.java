package thinkinjava.chapter10_innerclasses.exercise;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/24
 */
public class Outer {
    SimpleInterface innerFunction(Boolean b) {
        if (b) {
            class SimpleInterfaceImpl implements SimpleInterface {
                @Override
                public void fun() {
                    System.out.println("我是定义在innerFunction方法内的内部类的方法");
                }
            }
            return new SimpleInterfaceImpl();
        }
        return null;
    }


    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.innerFunction(true).fun();

    }
}
