package designPatterns.factoryMethodPattern;

/**
 * 具体的工厂类，giant工厂
 *
 * @author trevor.zhao
 * @date 2021/6/10
 */
public class GiantFactory extends BikeFactory{

    public Bike makeBike(String type) {
        Bike product = null;
        if (type.equals("公路车")) {
            product = new GiantRoadBike();
        }
        if (type.equals("山地车")) {
            product = new GiantRoadBike();
        }
        return product;
    }
}
