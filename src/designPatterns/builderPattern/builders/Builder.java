package designPatterns.builderPattern.builders;

import designPatterns.builderPattern.cars.CarType;
import designPatterns.builderPattern.components.Engine;
import designPatterns.builderPattern.components.GPSNavigator;
import designPatterns.builderPattern.components.Transmission;
import designPatterns.builderPattern.components.TripComputer;

/**
 * Builder接口定义创建产品所需的步骤
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
