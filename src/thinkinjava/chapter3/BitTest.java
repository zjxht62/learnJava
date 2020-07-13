package thinkinjava.chapter3;

/**
 * 位运算测试
 *
 * @author trevor.zhao
 * @date 2020/6/25
 */
public class BitTest {
    public static void main(String[] args) {
        int a = 0x13131;
        int b = 0x23110;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
    }
}
