package corejava1.chapter5.abstractClasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/20
 */
public abstract class Person {
    //定义一个抽象方法
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
