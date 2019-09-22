package headfirst.chapter3;

import OO.chapter2.YangHui;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/9
 */
public class chapter3 {
    public static void main(String[] args) {
//        int x = 34.5; //类型不符 double -> int
//        boolean boo = x; //类型不符 int -> boolean
        int g = 17;
        int y = g;
        y = y + 10;
        short s;
//        s = y; //类型不符 int -> short
        byte b = 3;
        byte v = b;
        short n = 12;
//        v = n; //大 -> 小 short->byte
//        byte k = 128; //超过数值范围
        int p = 3 * g + y;
    }


}
