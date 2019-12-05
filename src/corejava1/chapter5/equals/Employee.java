package corejava1.chapter5.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/20
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary = salary + raise;
    }

    @Override
    public boolean equals(Object otherObject) {
        //直接看引用地址是不是一个
        if (this == otherObject) return true;

        //如果为空必须返回false
        if (otherObject == null) return false;

        //如果类不匹配,不可能相等
        if (getClass() != otherObject.getClass()) return false;

        //现在我们知道otherObject对象是非空
        Employee other = (Employee) otherObject;

        //比较对应的值
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }


}
