package thinkinjava.chapter16_arrays;

import com.sun.crypto.provider.PBEWithMD5AndDESCipher;

import java.util.Arrays;

/**
 * 数组的操作
 *
 * @author trevor.zhao
 * @date 2020/10/14
 */
public class ArrayOptions {
    public static void main(String[] args) {
        BerylliumSphere[] a;//本地未初始化的变量
        BerylliumSphere[] b = new BerylliumSphere[5];
        //数组内的引用自动初始化为null
        System.out.println("b: " + Arrays.toString(b));
        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = new BerylliumSphere();
            }
        }

        //聚合的初始化
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        //动态的聚合初始化
        a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()};

        System.out.println("a.length = " + a.length);
        //length是数组能够容纳多少元素,而不是实际内部有多少元素
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);
        a = d;
        System.out.println("a.length = " + a.length);

        //基本数据类型的数组
        int[] e;
        int[] f = new int[5];
        //基本数据类型在数组里被初始化为0
        System.out.println("f: " + Arrays.toString(f));
        int[] g = new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }
        int[] h = {11, 47, 93};
        //编译错误 e未初始化
        //! System.out.println(e.length);
        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);
        e = h;
        System.out.println("e.length = " + e.length);
        e = new int[]{1, 2};
        System.out.println("e.length = " + e.length);
    }
}
