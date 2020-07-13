package thinkinjava.chapter6.outerpackage;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/7
 */
public class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name +": Speed!!!!");
    }
}
