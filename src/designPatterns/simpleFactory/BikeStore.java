package designPatterns.simpleFactory;


/**
 * 自行车店，就是客户端
 * 自行车店无需关心如何造自行车，只需要根据需求从工厂拿
 *
 * @author trevor.zhao
 * @date 2021/6/10
 */
public class BikeStore {
    private GiantFactory giantFactory;

    public BikeStore(GiantFactory giantFactory) {
        this.giantFactory = giantFactory;
    }

    public void sell(String type) {
        Bike giantBike = giantFactory.makeBike(type);
        giantBike.assembling();
    }


    public static void main(String[] args) {
        BikeStore bikeStore = new BikeStore(new GiantFactory());
        bikeStore.sell("山地车");
        bikeStore.sell("公路车");




    }
}
