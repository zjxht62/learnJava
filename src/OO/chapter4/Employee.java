package OO.chapter4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/14
 */
public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee() {
        name = "";
        salary = 0.0;
        department = "";
    }

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", salary=" + salary +
            ", department='" + department + '\'' +
            '}';
    }
}
