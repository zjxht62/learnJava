package headfirst.chapter7.coverTest;

import java.lang.annotation.Target;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/21
 */
public class Toaster extends Appllance {
    //不是方法的覆盖 因为参数不同
    public boolean trunOn(int level) {
        System.out.println("Toaster Turn on" + level);
        return true;
    }

    public static void main(String[] args) {
        Toaster toaster = new Toaster() ;
        toaster.trunOn(2);
        Appllance appllance = new Toaster();
        appllance.trunOn();
    }
}
