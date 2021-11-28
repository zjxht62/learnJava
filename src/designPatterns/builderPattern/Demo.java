package designPatterns.builderPattern;

import designPatterns.builderPattern.builders.CarBuilder;
import designPatterns.builderPattern.builders.CarManualBuilder;
import designPatterns.builderPattern.cars.Car;
import designPatterns.builderPattern.cars.Manual;
import designPatterns.builderPattern.director.Director;

public class Demo {
    public static void main(String[] args) {
        //Director 从客户端获取具体的构建器对象，因为应用知道具体需要哪种builder来创建哪种产品
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        //最终产品通常由builder获得，因为Director不知道也不依赖具体的builder和产品，Director只用来定义步骤顺序和参数
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        //Director可以和很多种不同的builder配合
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}
