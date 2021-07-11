package designPatterns.iteratorPattern;

import thinkinjava.chpter4.WhileTest;

import java.util.Iterator;

/**
 * 测试迭代器
 *
 * @author trevor.zhao
 * @date 2021/7/9
 */
public class TestMenuIterator {

    public static void main(String[] args) {
        JinyuMenu jinyuMenu = new JinyuMenu();
        Iterator<String> iterator = jinyuMenu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
