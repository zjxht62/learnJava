package designPatterns.factoryMethodPattern;

/**
 * 自行车工厂
 *
 * @author trevor.zhao
 * @date 2021/6/11
 */
public abstract class BikeFactory {
    public abstract Bike makeBike(String type);
}


