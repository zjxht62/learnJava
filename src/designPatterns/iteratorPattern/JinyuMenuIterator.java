package designPatterns.iteratorPattern;

import java.util.Iterator;
import java.util.List;

/**
 * 金隅大厦菜单迭代器，实现抽象迭代器接口
 *
 * @author trevor.zhao
 * @date 2021/7/9
 */
public class JinyuMenuIterator implements Iterator<String> {
    private List<String> menu;
    Integer index = 0;

    public JinyuMenuIterator(List<String> menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        if (index < this.menu.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        return this.menu.get(index++);
    }
}
