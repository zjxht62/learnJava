package designPatterns.iteratorPattern;

import java.util.Iterator;
import java.util.List;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2021/7/9
 */
public class MenuIterator implements Iterator<String> {
    private List<String> menu;
    Integer index = 0;

    public MenuIterator(List<String> menu) {
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
