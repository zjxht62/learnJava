package thinkinjava.chapter7.reusing;


import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/13
 */
class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    //编译时常量
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    //典型的常量 可以在包外访问 只有一份 不可改变
    public static final int VALUE_THREE = 39;

    //运行时决定的常量
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    //数组
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4= " + i4 + ",INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");

        //!fd1.valueOne++; 无法改变final的值
        fd1.v2.i++;//对象引用是final但是可以改变其内部的值
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;//数组里面的对象不是final的,所以可以改变
        }
        //fd1.v2 = new Value(0); 不能改变引用
        //fd1.VAL_3 = new Value(1);不能改变引用
        //fd1.a = new int[3]; 不能改变引用
        print(fd1);
        print("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);
    }
}

