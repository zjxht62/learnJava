package designPatterns.builderPattern.builders;

import designPatterns.builderPattern.cars.Car;
import designPatterns.builderPattern.cars.CarType;
import designPatterns.builderPattern.components.Engine;
import designPatterns.builderPattern.components.GPSNavigator;
import designPatterns.builderPattern.components.Transmission;
import designPatterns.builderPattern.components.TripComputer;

/**
 * 具体的builder实现Builder接口中定义的步骤
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;

    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
