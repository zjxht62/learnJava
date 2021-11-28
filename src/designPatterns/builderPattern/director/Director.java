package designPatterns.builderPattern.director;

import designPatterns.builderPattern.builders.Builder;
import designPatterns.builderPattern.cars.CarType;
import designPatterns.builderPattern.components.Engine;
import designPatterns.builderPattern.components.GPSNavigator;
import designPatterns.builderPattern.components.Transmission;
import designPatterns.builderPattern.components.TripComputer;

/**
 * Director定义了构建步骤的顺序。它和一个实现Builder接口的builder对象协作。因此，它并不知道构建的产品是什么。
 */
public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
