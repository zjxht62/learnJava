package corejava1.chapter5.inheritance;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/19
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        //调用父类的构造方法
        super(name, salary, year, month, day);
        bonus = 0;
    }

    //覆盖父类的获取salary的方法
    public double getSalary() {
        //调用父类的getSalary
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        this.bonus = b;
    }


}
