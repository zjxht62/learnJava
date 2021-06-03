package designPatterns.decoratorPattern;

/**
 * 具体的装饰器：加波霸
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public class BobaDecorator extends BaseDecorator {
    public BobaDecorator(Beverage beverage) {
        super(beverage);
        cost = 4;
        description = "加波霸";
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
