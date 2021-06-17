package designPatterns.decoratorPattern;

/**
 * 装饰器基类，必须实现和具体饮料相同的接口
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public class BeverageBaseDecorator extends Beverage {
    /**
     * 被装饰的饮料
     */
    protected Beverage wrappeeBeverage;

    public BeverageBaseDecorator(Beverage beverage) {
        this.wrappeeBeverage = beverage;
    }

    /**
     * 在基类中就调用了被装饰对象的方法，子类中只需要super.getCost()
     * @return
     */
    @Override
    public Double getCost() {
        return wrappeeBeverage.getCost();
    }

}
