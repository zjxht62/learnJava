package OO.chapter4.exp4_3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/16
 */
public class TeacherClass extends PersonClass {
    private String department;
    private String duty;
    private double salary;

    public TeacherClass() {
        super();
    }

    public TeacherClass(int No, String name, boolean sex, int year, int month, int day, String department, String duty, double salary) {
        super(No, name, sex, year, month, day);
        this.department = department;
        this.duty = duty;
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getDuty() {
        return duty;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment:" + department + "\nDuty:" + duty + "\nsalary" + salary;
    }
}
