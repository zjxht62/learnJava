package thinkinjava.chapter3;

import static net.mindview.util.Print.*;

/**
 * 直接常量
 *
 * @author trevor.zhao
 * @date 2020/6/24
 */
public class Literals {
    public static void main(String[] args) {
        //十六进制
        int i1 = 0x2f;
        print("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F;
        print("i2: " + Integer.toBinaryString(i2));

        //八进制
        int i3 = 0177;
        print("i3: " + Integer.toBinaryString(i3));

        //char最大16进制值
        char c = 0xffff;
        print("c: " + Integer.toBinaryString(c));

        //byte最大16进制值
        byte b = 0x7f;
        print("b: " + Integer.toBinaryString(b));

        //short最大16进制值
        short s = 0x7fff;
        print("s: " + Integer.toBinaryString(s));

        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1d;
        double d2 = 1D;




    }

}
