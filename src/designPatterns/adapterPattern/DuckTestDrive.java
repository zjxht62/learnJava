package designPatterns.adapterPattern;

/**
 * 测试类
 */
public class DuckTestDrive {
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turky = new WildTurky();
        Duck turkyAdapter = new TurkyAdapter(turky);

        System.out.println("The Turky says...");
        turky.gobble();
        turky.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkyAdapter says...");
        testDuck(turkyAdapter);

    }
}
