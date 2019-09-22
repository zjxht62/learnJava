package OO.chapter2;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2018/12/25
 */
public class TestClass {
    public static void main(String[] args) {
        //产生上溢的情况
        double d =  1e308;
        System.out.println("overflow produces infinity");
        System.out.println(d + " * 10 =" + d * 10);

        //产生下溢的情况
        d = 1e-320 * Math.PI;
        System.out.println("gradual underflow:" + d);
        for (int i = 0; i < 4; i++) {
            System.out.println(" " + (d / 100000));
            System.out.println(i);
        }
        System.out.println();

        //产生NaN的情况
        System.out.println("0.0/0.0 is not a number");
        d = 0.0 / 0.0;
        System.out.println(d);

        //float类型运算产生一个不可精确表示的结果值及舍入情况
        System.out.println("inexact results with float:");
        for (int i = 0; i < 100; i++) {
            float z = 1.0f/i;
            if (z * i != 1.0f) System.out.println(" " + i);
        }
        System.out.println();

        //double类型运算产生一个不可精确表示的结果值及舍入情况
        System.out.println("inexact results with double:");
        for (int i = 0; i < 100; i++) {
            double z = 1.0/i;
            if (z * i != 1.0) System.out.println(" " + i);
        }
        System.out.println();

    }
}
