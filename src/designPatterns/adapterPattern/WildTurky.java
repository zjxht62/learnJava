package designPatterns.adapterPattern;

/**
 * 未被适配的适配者
 */
public class WildTurky implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");

    }
}
