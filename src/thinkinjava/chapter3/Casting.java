package thinkinjava.chapter3;

/**
 * 强制类型转换
 *
 * @author trevor.zhao
 * @date 2020/6/27
 */
public class Casting {
    public static void main(String[] args) {
        int i = 100;
        long lng = (long)i;//扩展转换，可以不必显式进行类型转换
        lng = i;
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;//窄化转换，必须强制类型转换，窄化转换（将能容纳更多信息的山水类型转换成无法容纳那么多信息的类型，可能面临信息丢失的危险）
    }
}
