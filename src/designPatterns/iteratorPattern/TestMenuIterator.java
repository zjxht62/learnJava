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
        KFCMenu kfcMenu = new KFCMenu();

        System.out.println("打印金隅大厦菜单");
        Iterator<String> iterator = jinyuMenu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        System.out.println("打印KFC菜单");
        iterator = kfcMenu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //打印金隅大厦菜单
        //糖醋里脊
        //辣炒圆白菜
        //铁板豆腐
        //凉皮
        //
        //打印KFC菜单
        //吮指原味鸡
        //上校鸡块
        //葡式蛋挞
    }


}
