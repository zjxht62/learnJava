package corejava.chapter5.inheritance;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/19
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Cral Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 4, 15);

        //多态
        for (Employee e : staff) {
            System.out.println("name= " + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
