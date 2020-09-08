package thinkinjava.chapter13_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 打印内存地址
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class InfiniteRecursion {
    //这里会产生递归调用,+this的时候会调用toString
//    public String toString() {
//        return "InfiniteRecursion address:" + this + "\n";
//    }

    //调用Object的toString打印内存地址
    public String toString() {
        return "InfiniteRecursion address:" + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
