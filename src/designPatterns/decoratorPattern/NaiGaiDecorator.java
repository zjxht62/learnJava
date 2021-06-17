package designPatterns.decoratorPattern;

/**
 * 具体的装饰器：加奶盖
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public class NaiGaiDecorator extends BeverageBaseDecorator {
    public NaiGaiDecorator(Beverage beverage) {
        super(beverage);
        cost = 2;
        description = "加奶盖";
    }

    @Override
    public Double getCost() {
        return super.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return wrappeeBeverage.getDescription() + description;
    }
}
