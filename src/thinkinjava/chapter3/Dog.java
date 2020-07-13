package thinkinjava.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/22
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";

        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        Dog newdog = spot;

        System.out.println(spot.name);
        System.out.println(spot.says);

        System.out.println(scruffy.name);
        System.out.println(scruffy.says);

        System.out.println(newdog==spot);
        System.out.println(newdog==scruffy);
        System.out.println(newdog.equals(spot));//因为equals默认比较引用的地址，所以返回true
        System.out.println(newdog.equals(scruffy));

    }
}
