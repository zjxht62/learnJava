package designPatterns.factoryMethodPattern;

/**
 * 具体的工厂类，UCC工厂
 *
 * @author trevor.zhao
 * @date 2021/6/10
 */
public class UCCFactory extends BikeFactory {

    @Override
    public Bike makeBike(String type) {
        Bike product = null;

        if (type.equals("公路车")) {
            product = new UCCRoadBike();
        }
        if (type.equals("山地车")) {
            product = new UCCMountainBike();
        }
        return product;
    }
}
