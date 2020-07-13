package thinkinjava.chapter2;

import java.sql.SQLOutput;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/20
 */
public class AutoBoxing {
    public static void main(String[] args) {
        Boolean is = true;
        Byte b = 1;
        Short s = 1;
        Integer integer = 1;
        Long l = 1L;
        Float f = 34.3f;
        Double d = 423.534;
        Character character = 'c';

        System.out.println(is);
        System.out.println(b);
        System.out.println(s);
        System.out.println(integer);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(character);
    }
}
