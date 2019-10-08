package corejava.chapter9.treeSet;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/10/8
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        NavigableSet<Item> sortByDescrtption = new TreeSet<>(
            Comparator.comparing(Item::getDescription));

        sortByDescrtption.addAll(parts);
        System.out.println(sortByDescrtption);
    }
}
