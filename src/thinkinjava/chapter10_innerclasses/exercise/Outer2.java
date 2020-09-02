package thinkinjava.chapter10_innerclasses.exercise;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/24
 */
public class Outer2 {
    private class SimpleInterfaceImpl implements SimpleInterface {
        @Override
        public void fun() {
            System.out.println("我是private的内部类,实现了接口的方法");
        }

        public void fun1() {
            System.out.println("我是内部类自己定义的方法");
        }
    }

    public SimpleInterface getInterface() {
        return new SimpleInterfaceImpl();
    }

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        SimpleInterface simpleInterface = outer2.getInterface();
        simpleInterface.fun();

    }
}
