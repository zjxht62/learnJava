package OO.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/7
 */
public class StaticTest {
    public static void main(String[] args) {
        Employee staff[] = new Employee[3];
        staff[0] = new Employee("哇哈哈哈", 72384.1);
        staff[1] = new Employee("以后常常", 812384.1);
        staff[2] = new Employee("赛安抚", 4384.1);

        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].getId() + staff[i].getName() + staff[i].getSalary());
        }
    }
}
