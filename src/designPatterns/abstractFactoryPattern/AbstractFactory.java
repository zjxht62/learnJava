package designPatterns.abstractFactoryPattern;

/**
 * 抽象的自行车工厂
 */
public interface AbstractFactory {
    Wheels makeWheels(String model);

    Frame makeFrame(String model);
}
