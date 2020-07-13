package thinkinjava.chapter7.reusing;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/13
 */
class Poppet {
    private int i;

    Poppet(int ii) {
        i = ii;
    }
}
public class BlankFinal {
    private final int i = 0; //直接在定义时初始化的final值
    //两个空的final值
    private final int j;
    private final  Poppet p;

    //空的final值必须在构造器中初始化

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(28);
    }
}
