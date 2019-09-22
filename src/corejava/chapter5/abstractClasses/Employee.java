package corejava.chapter5.abstractClasses;

import java.time.LocalDate;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/20
 */
public class Employee extends Person {
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int day) {
        //调用父类的构造方法
        super(name);
        this.salary = salary;
        hireDate = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    //实现父类的抽象方法
    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent/100;
        salary += raise;
    }
}
