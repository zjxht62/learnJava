package thinkinjava.chapter15_generics;

import javax.swing.text.html.HTML;

/**
 * Java SE5之前，没有对泛型的支持，让这个类持有object
 *
 * @author trevor.zhao
 * @date 2020/9/27
 */
public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new AutoMobile());
        AutoMobile a = (AutoMobile)holder2.get();
        holder2.set("Not an Automobile");
        String s = (String)holder2.get();
        holder2.set(1);
        Integer x = (Integer)holder2.get();
    }
}
