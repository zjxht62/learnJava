package thinkinjava.chapter12_exception.exercise;

/**
 * @author trevor.zhao
 * @date 2020/6/2
 */
class ResumerException extends Exception {

}

class Resumer {
    static int count = 3;
    static void f() throws ResumerException {
        if (--count > 0) {
            throw new ResumerException();
        }

    }
}
public class E05_Resumption {
    public static void main(String[] args) {
        while (true) {
            try {
                Resumer.f();
            } catch (ResumerException e) {
                System.out.println("捕获到异常 " + e);
                continue;
            }
            System.out.println("try块成功通过");
            break;
        }
        System.out.println("执行成功");
    }
}
