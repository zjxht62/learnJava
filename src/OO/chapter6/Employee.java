package OO.chapter6;

import java.io.Serializable;
import java.util.Date;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/25
 */
public class Employee implements Serializable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, Date d) {
        name = n;
        salary = s;
        hireDay = d;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return name + " " + salary + " " + hireYear();
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireDay.getYear();
    }
}
