package headfirst.chapter9.constructorwithparam;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/24
 */
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String theName) {
        name = theName;
    }
}
