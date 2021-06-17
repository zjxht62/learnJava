package designPatterns.abstractFactoryPattern;

/**
 * 抽象的产品之二，轮组
 */
public abstract class Wheels {
    private String name;
    private String material;
    private String size;

    public Wheels(String name, String material, String size) {
        this.name = name;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
