package designPatterns.simpleFactory;

/**
 * 一个简单工厂类，giant工厂
 *
 * @author trevor.zhao
 * @date 2021/6/10
 */
public class GiantFactory {
    //由工厂复杂创建产品，将车店和造车的过程解耦
    public Bike makeBike(String type) {
        Bike product = null;
        if (type.equals("公路车")) {
            product = new GiantRoadBike();
        }
        if (type.equals("山地车")) {
            product = new GiantMountainBike();
        }
        return product;
    }
}
