package corejava1.chapter4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/17
 */
public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        //print out information about all employee objects
        for (Employee employee : staff) {
            employee.setId();
            System.out.println("name=" + employee.getName() + ",id=" + employee.getId() + ",salary=" + employee.getSalary());
        }
        //call static method
        int n = Employee.getNextId();
        System.out.println("Next available id = " + n);


    }


}
