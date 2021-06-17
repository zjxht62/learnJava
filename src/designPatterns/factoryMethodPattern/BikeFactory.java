package designPatterns.factoryMethodPattern;

/**
 * 抽象的工厂，提供工厂方法。自行车工厂
 *
 * @author trevor.zhao
 * @date 2021/6/11
 */
public abstract class BikeFactory {
    //子类实现创建的动作
    public abstract Bike makeBike(String type);
}


