package thinkinjava.chapter9_interface;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/19
 */
public class Son extends Father{
    public void say() {
        System.out.println("I'm son");
    }
    static void makeSound(Father father) {
        ((Son)father).say();

    }

    public static void main(String[] args) {
        Son son = new Son();
        makeSound(son);
    }
}
