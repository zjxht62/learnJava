package OO.chapter4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/14
 */
public class Manager extends Employee {
    private double special;

    public Manager() {
        super();
        this.special = 0.0;
    }

    public Manager(String name, double salary, String department, double special) {
        super(name, salary, department);
        this.special = special;
    }

    public void setSpecial(double special) {
        this.special = special;
    }

    public double getSpecial() {
        return special;
    }

    @Override
    public String  toString() {
        return "Manager{" +
            "special=" + special +
            '}';
    }
}
