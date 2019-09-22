package OO.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/7
 */
public class Employee {
    private String name;
    private double salary;
    private int id;
    private static int nextId;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        this.id = ++nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }
}
