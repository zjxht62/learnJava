package JavaDoc.IO.Formatter;

/**
 * 使用format方法格式化
 *
 * @author trevor.zhao
 * @date 2021/5/11
 */
public class Root2 {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.format("The square root of %d is %f.%n", i, r);
    }
}