package thinkinjava.chapter10_innerclasses.pk2;

import thinkinjava.chapter10_innerclasses.pk1.SimpleInterface;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/23
 */
public class SimpleClass {
    protected class Inner implements SimpleInterface {
        @Override
        public void fun() {
            System.out.println("SimpleClass.Inner.fun()");
        }
    }
}
