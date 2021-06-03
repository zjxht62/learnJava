package designPatterns.decoratorPattern;

/**
 * 装饰器基类，必须实现和具体饮料相同的接口
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public class BaseDecorator extends Beverage {
    /**
     * 被装饰的饮料
     */
    protected Beverage wrappeeBeverage;

    public BaseDecorator(Beverage beverage) {
        this.wrappeeBeverage = beverage;
    }

    @Override
    public Double getCost() {
        return wrappeeBeverage.getCost();
    }

}
