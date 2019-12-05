package corejava1.chapter5.abstractClasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/20
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
