package corejava1.chapter4.PackageTest.com.horstmann.corejava;

import java.time.LocalDate;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/18
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void raiseSalary(double byPersent) {
        double raise = salary * byPersent/100;
        salary += raise;
    }
}
