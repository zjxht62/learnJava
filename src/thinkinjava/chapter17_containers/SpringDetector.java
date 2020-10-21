package thinkinjava.chapter17_containers;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/20
 */
public class SpringDetector {
    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(ghog.newInstance(i), new Prediction());
        }
        System.out.println("map = " + map);
        //因为使用了默认的object的hashCode()方法,所以默认使用对象的地址计算散列码
        Groundhog gh = ghog.newInstance(3);
        System.out.println("Looking up prediction for " + gh);
        if (map.containsKey(gh)) {
            System.out.println(map.get(gh));
        } else {
            System.out.println("Key not found: " + gh);
        }
    }

    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);
    }
}
