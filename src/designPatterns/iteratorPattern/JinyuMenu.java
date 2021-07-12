package designPatterns.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 金隅大厦菜单，一个具体的聚合，使用List存储数据
 *
 * @author trevor.zhao
 * @date 2021/7/9
 */
public class JinyuMenu implements Menu{
    private List<String> menu = new ArrayList<>();

    public JinyuMenu() {
        this.menu.add("糖醋里脊");
        this.menu.add("辣炒圆白菜");
        this.menu.add("铁板豆腐");
        this.menu.add("凉皮");
    }

    /**
     * 实现抽象聚合接口，返回具体的迭代器实例,这里可以直接返回ArrayList的迭代器
     * @return
     */
    @Override
    public Iterator<String> getIterator() {
        return menu.iterator();
    }


}
