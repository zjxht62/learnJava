package designPatterns.factoryMethodPattern;

/**
 * 自行车店，就是客户端
 * 自行车店无需关心如何造自行车，只需要根据需求从工厂拿
 *
 * @author trevor.zhao
 * @date 2021/6/10
 */
public class BikeStore {
    public static void main(String[] args) {
        BikeFactory bikeFactory = new GiantFactory();
        Bike giantBike = bikeFactory.makeBike("公路车");
        giantBike.assembling();
        bikeFactory = new UCCFactory();

        Bike UCCBike = bikeFactory.makeBike("山地车");
        UCCBike.assembling();


    }
}
