package designPatterns.decoratorPattern;

/**
 * 具体的饮料类：绿妍
 *
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public class LvYan extends Beverage {
    public LvYan() {
        cost = 19;
        description = "绿妍，绿茶";
    }

    @Override
    public Double getCost() {
        return cost;
    }

}
