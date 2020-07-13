package thinkinjava.chapter6;

import thinkinjava.chapter6.outerpackage.Car;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/7
 */
public class CarTest {
    public static void main(String[] args) {
        thinkinjava.chapter6.outerpackage.Car car = new Car("R36");
        car.makeSound();
    }
}
