package thinkinjava.chapter17_containers;

import java.util.*;

/**
 * 容器的快速报错
 *
 * @author trevor.zhao
 * @date 2020/10/28
 */
public class FailFast {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        Iterator<String> it = c.iterator();
        //在获取迭代器之后，又有东西放入了容器中
        c.add("An object");
        try {
            String s = it.next();
        } catch (ConcurrentModificationException e) {
            System.out.println(e);
        }

    }
}
