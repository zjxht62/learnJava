package corejava.chapter4.PackageTest;
//定义Employee的类路径
import corejava.chapter4.PackageTest.com.horstmann.corejava.Employee;

import static java.lang.System.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/18
 */
public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);

        //因为已经static import过了 所以不用System.out
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());

    }
}
