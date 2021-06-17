package designPatterns.abstractFactoryPattern;

/**
 * 自行车店，客户端
 */
public class BikeStore {
    public static void main(String[] args) {
        AbstractFactory factory = new GiantFactory();
        Wheels wheels = factory.makeWheels("SLR");
        Frame frame = factory.makeFrame("TCR");
        System.out.println(wheels);
        System.out.println(frame);
    }
}
