package designPatterns.simpleFactory;

/**
 * 自行车店，就是客户端
 * 自行车店无需关心如何造自行车，只需要根据需求从工厂拿
 *
 * @author trevor.zhao
 * @date 2021/6/10
 */
public class BikeStore {
    public static void main(String[] args) {
        Bike giantMountainBike = GiantFactory.makeBike("山地车");
        Bike UCCRoadBike = UCCFactory.makeBike("公路车");


    }
}
