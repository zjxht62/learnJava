package designPatterns.iteratorPattern;

import java.util.Iterator;

/**
 * KFC菜单，另一个具体的聚合，使用数组存储数据
 */
public class KFCMenu implements Menu{
    private String[] menu = new String[3];

    public KFCMenu() {
        menu[0] = "吮指原味鸡";
        menu[1] = "上校鸡块";
        menu[2] = "葡式蛋挞";
    }

    /**
     * 实现抽象聚合接口，返回具体的迭代器实例
     * @return
     */
    @Override
    public Iterator<String> getIterator() {
        return new KFCMenuIterator(menu);
    }
}
