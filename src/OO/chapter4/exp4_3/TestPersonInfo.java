package OO.chapter4.exp4_3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/16
 */
public class TestPersonInfo {
    public static void main(String[] args) {
        PersonClass info[] = new PersonClass[3];

        info[0] = new PersonClass(1, "娃哈哈", true, 88, 10, 2);
        info[1] = new TeacherClass(2, "偶吼吼", true, 70, 8, 12, "计算机", "教授", 10000.0);
        info[2] = new StudentClass(3, "哎嘿嘿", false, 87, 3, 22, "计算机技术", 610);

        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
    }
}
