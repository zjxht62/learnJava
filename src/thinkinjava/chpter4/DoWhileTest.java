package thinkinjava.chpter4;

/**
 * 测试Do-While循环
 *
 * @author trevor.zhao
 * @date 2020/6/28
 */
public class DoWhileTest {

    public static void main(String[] args) {
        int i = 1;
        //虽然while里面一开始判断结果就是false，但是循环体里面的语句至少会执行一次
        do {
            System.out.println(i);
        } while (i > 1);

    }
}
