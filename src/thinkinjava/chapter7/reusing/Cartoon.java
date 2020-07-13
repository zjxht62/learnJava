package thinkinjava.chapter7.reusing;

import thinkinjava.chapter6.outerpackage.Car;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/10
 */
class Cartoon extends Drawing{
    Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }

}
