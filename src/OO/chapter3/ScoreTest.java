package OO.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/4
 */
public class ScoreTest {
    public static void main(String[] args) {
        ScoreClass student[] = new ScoreClass[10];

        for (int i = 0; i < student.length; i++) {
            student[i] = new ScoreClass(1000 + i, (int)(Math.random() * 100));
        }

        for (int i = 0; i < student.length; i++) {
            System.out.println("学号是" + student[i].getNo() + "的学生的分数是" + student[i].getScore());
        }
    }
}
