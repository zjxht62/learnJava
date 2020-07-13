package thinkinjava.chapter3;

import static net.mindview.util.Print.*;


/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/22
 */
public class AutoInc {
    public static void main(String[] args) {
        //测试前缀和后缀的自增自减
        int i = 1;
        print("i:" + i);  //1
        print("++i：" + ++i); //先运行自增，再参与运算 //2
        print("i++：" + i++); //先参与运算，再自增 //2
        print("i:" + i); //3
        print("--i：" + --i); //先运行自减，再参与运算 //2
        print("i--：" + i--); //先参与运算，再自减 //2
        print("i:" + i); //1


    }

}
