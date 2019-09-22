package OO.chapter4.exp4_3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/16
 */
public class StudentClass extends PersonClass {
    private String major;
    private int score;

    public StudentClass() {
        super();
    }

    public StudentClass(int No, String name, boolean sex, int year, int month, int day, String major, int score) {
        super(No, name, sex, year, month, day);
        this.major = major;
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMajor:" + major + "\nScore:" + score;
    }

}
