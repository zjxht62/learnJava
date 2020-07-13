package thinkinjava.chapter5;

import com.sun.crypto.provider.PBEWithMD5AndDESCipher;
import thinkinjava.chapter6.access.Pie;

import java.util.Arrays;

/**
 * 测试String数组
 *
 * @author trevor.zhao
 * @date 2020/7/7
 */
public class StringArrayTest {
    public static void main(String[] args) {
        MyString myString = new MyString("哈哈");
        myString.accept("嘿嘿", "哼哼", "呼呼");
    }

}
class MyString {
    public MyString(String s) {
        System.out.println("Constructor:" + s);
    }
    public void accept(String... strings) {
        System.out.println(Arrays.toString(strings));
    }
}
