package thinkinjava.chapter12_exception.switchTest;


/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/30
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffException1, OnOffException2 {}


    public static void main(String[] args) {
        try {
            //如果出现了不是上述两种异常的新异常,无法保证开关在执行后是off状态
            sw.on();
            f();
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }

    }
}
