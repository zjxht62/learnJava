package designPatterns.iteratorPattern;

import java.util.Iterator;
import java.util.List;

/**
 * KFC菜单迭代器，实现抽象迭代器接口
 *
 * @author trevor.zhao
 * @date 2021/7/9
 */
public class KFCMenuIterator implements Iterator<String> {
    private String[] menu;
    Integer index = -1;

    public KFCMenuIterator(String[] menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        if (index < this.menu.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        return this.menu[++index];
    }
}
