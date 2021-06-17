package designPatterns.factoryMethodPattern;

/**
 * 抽象的产品，具体的产品继承自它。
 * 对于这种在创建过程中需要多个步骤的情况，更适合使用工厂模式
 *
 * @author trevor.zhao
 * @date 2021/6/10
 */
public abstract class Bike {
    private String brand;
    private String type;

    public Bike(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    protected void assembling() {
        System.out.println("组装中。。。" + "品牌：" + brand + "，车型：" + type);
    }
}
