package designPatterns.iteratorPattern;

import java.util.Iterator;

/**
 * 抽象聚合，菜单接口
 */
public interface Menu {
    Iterator<String> getIterator();
}
