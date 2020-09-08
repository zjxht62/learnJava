package thinkinjava.chapter13_strings;

/**
 * 测试格式化输出
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 4.523423;
        //字符串+的方式
        System.out.println("Row 1: [" + x + " " + y + "]");
        //格式化输出
        System.out.printf("Row 1: [%d %f]", x, y);
        System.out.format("Row 1: [%d %f]", x, y);


    }
}
