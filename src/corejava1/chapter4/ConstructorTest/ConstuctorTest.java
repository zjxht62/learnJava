package corejava1.chapter4.ConstructorTest;

import java.util.Random;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/18
 */
public class ConstuctorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }

}

class Employee {
    private static int nextId;

    private int id;
    private String name = "";//实例域初始化
    private double salary;

    //静态初始化块 类第一次加载的时候调用
    static {
        Random generator = new Random();
        //set nextid to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //对象初始化快
    {
        id = nextId;
        nextId++;
    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        //调用上面这个两个参数的构造方法
        this("Employee #" + nextId, s);
    }

    public Employee() {
        //name 初始化为""
        //salary 初始化为0
        //id在对象初始化块初始化了
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
