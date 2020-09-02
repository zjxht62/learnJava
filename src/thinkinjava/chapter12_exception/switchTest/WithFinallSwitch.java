package thinkinjava.chapter12_exception.switchTest;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/30
 */
public class WithFinallSwitch {
    private static Switch sw = new Switch();


    public static void main(String[] args) {
        try {
            sw.on();
            //可能抛出异常的代码
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        } finally {
            sw.off();
        }

    }
}
