package designPatterns.decoratorPattern;

/**
 * 饮料抽象类
 * 具体的饮料和饮料装饰器都实现这个接口
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public abstract class Beverage {
    protected double cost;
    protected String description;

    /**
     * 抽象的方法，子类中实现
     * @return
     */
    public abstract Double getCost();

    public String getDescription() {
        return description;
    }
}
