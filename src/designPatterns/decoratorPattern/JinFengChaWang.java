package designPatterns.decoratorPattern;

/**
 * 具体的饮料类：金凤茶王
 *
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public class JinFengChaWang extends Beverage {
    public JinFengChaWang() {
        cost = 18;
        description = "金凤茶王，乌龙茶";    }

    @Override
    public Double getCost() {
        return cost;
    }


}
