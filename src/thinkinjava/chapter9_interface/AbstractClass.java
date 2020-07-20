package thinkinjava.chapter9_interface;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/19
 */
public abstract class AbstractClass {
    private String name;

    public AbstractClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractClass{" +
            "name='" + name + '\'' +
            '}';
    }

    public static void main(String[] args) {
//        AbstractClass abstractClass = new AbstractClass("name");
    }
}
