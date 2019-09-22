package OO.chapter6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/25
 */
public class ObjectFileTest {
    public static void main(String[] args) {
        try {
            Employee staff[] = new Employee[3];

            staff[0] = new Employee("Harry Hacker", 35000, new Date(1989, 10, 1));
            staff[1] = new Employee("Carl Cracker", 75000, new Date(1987, 12, 15));
            staff[2] = new Employee("Tony Tester", 38000, new Date(1990, 3, 15));

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
            out.writeObject(staff);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"));
            Employee newstaff[] = (Employee[])in.readObject();

            int i;
            for (i = 0; i < newstaff.length; i++) {
                newstaff[i].raiseSalary(100);
            }
            for (i = 0; i < newstaff.length; i++) {
                System.out.println(newstaff[i]);
            }
        } catch (Exception e) {

        }
    }
}
