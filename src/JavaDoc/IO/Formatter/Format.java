package JavaDoc.IO.Formatter;

/**
 * 各种格式化标识符
 *
 * @author trevor.zhao
 * @date 2021/5/11
 */
public class Format {
    public static void main(String[] args) {
        System.out.format("%f, %1$-20.10f %n", Math.PI);
    }
}