package designPatterns.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2021/7/9
 */
public class JinyuMenu {
    private List<String> menu = new ArrayList<>();

    public JinyuMenu() {
        this.menu.add("糖醋里脊");
        this.menu.add("辣炒圆白菜");
        this.menu.add("铁板豆腐");
        this.menu.add("凉皮");
    }

    public Iterator<String> getIterator() {
        return new MenuIterator(menu);
    }


}
