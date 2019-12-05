package corejava1.chapter4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/17
 */
public class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
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

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("harry", 50000);
        System.out.println(employee.getName() + " " + employee.getSalary());
    }

}