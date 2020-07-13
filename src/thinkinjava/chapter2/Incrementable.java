package thinkinjava.chapter2;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/20
 */
public class Incrementable {
    static void increment() {StaticTest.i++;}

    public static void main(String[] args) {
        StaticTest staticTest0 = new StaticTest();
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();

        System.out.println(staticTest0.i);
        System.out.println(staticTest1.i);
        System.out.println(staticTest2.i);

        staticTest0.i++;

        System.out.println(staticTest0.i);
        System.out.println(staticTest1.i);
        System.out.println(staticTest2.i);

        staticTest2.i++;

        System.out.println(staticTest0.i);
        System.out.println(staticTest1.i);
        System.out.println(staticTest2.i);


    }
}
