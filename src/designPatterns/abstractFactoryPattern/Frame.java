package designPatterns.abstractFactoryPattern;

/**
 * 抽象的产品之一，车架
 */
public abstract class Frame {
    private String name;
    private String material;
    private String type;

    public Frame(String name, String material, String type) {
        this.name = name;
        this.material = material;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
