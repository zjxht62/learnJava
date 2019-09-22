package OO.chapter4.exp4_4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/16
 */
public abstract class Animal {
    protected String type;
    protected String name;
    protected String breed;

    public Animal(String type, String name, String breed) {
        this.type = type;
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "This is a " + type + "\nIt's " + name + " the " + breed;
    }

    public abstract void sound();
}
