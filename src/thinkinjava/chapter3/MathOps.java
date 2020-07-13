package thinkinjava.chapter3;

import static net.mindview.util.Print.*;

import java.util.Random;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/21
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        print("j:" + j);
        k = rand.nextInt(100) + 1;
        print("K:" + k);
        i = j + k;
        print("j + k:" + i);
        i = j - k;
        print("j - k:" + i);
        i = j / k;
        print("j / k:" + i);
        i = j * k;
        print("j * k:" + i);
        j %= k;
        print("j %= k:" + j);
        //float型测试
        float u, v, w;
        v = rand.nextFloat();
        print("v:" + v);
        w = rand.nextFloat();
        print("w:" + w);
        u = v + w;
        print("v + w:" + u);
        u = v - w;
        print("v - w:" + u);
        u = v * w;
        print("v * w:" + u);
        u = v / w;
        print("v / w:" + u);

        //下面的操作也适用于char, byte, short, int, long, double
        u += v;
        print("u += v:" + u);
        u -= v;
        print("u -= v:" + u);
        u *= v;
        print("u *= v:" + u);
        u /= v;
        print("u /= v:" + u);

    }
}
