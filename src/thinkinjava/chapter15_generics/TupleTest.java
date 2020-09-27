package thinkinjava.chapter15_generics;

import com.sun.javafx.scene.control.behavior.TwoLevelFocusPopupBehavior;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/9/27
 */
class Amphibian{}
class Vehicle{}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
    }
}
