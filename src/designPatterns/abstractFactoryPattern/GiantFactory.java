package designPatterns.abstractFactoryPattern;

/**
 * 具体的工厂
 */
public class GiantFactory implements AbstractFactory {
    @Override
    public Wheels makeWheels(String model) {
        if (model.equals("PR2")) {
            return new GiantPR2Wheels();
        } else if (model.equals("SLR")) {
            return new GiantSLRWheels();
        }
        return null;
    }

    @Override
    public Frame makeFrame(String model) {
        if (model.equals("TCR")) {
            return new GiantTCRFrame();
        } else if (model.equals("XTC")) {
            return new GiantXTCFrame();
        }
        return null;
    }
}
