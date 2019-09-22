package headfirst.chapter16;

import java.util.HashMap;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/3
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> acores = new HashMap<>();
        acores.put("Kathy", 42);
        acores.put("Bert", 343);
        acores.put("Skyler", 420);

        System.out.println(acores);
        System.out.println(acores.get("Bert"));
    }
}
