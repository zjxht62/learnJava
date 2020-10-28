package thinkinjava.chapter17_containers;

import net.mindview.util.Countries;

import java.util.*;

/**
 * 不可变集合demo
 *
 * @author trevor.zhao
 * @date 2020/10/28
 */
public class ReadOnly {
    static Collection<String> data = new ArrayList<String>(Countries.names(6));

    public static void main(String[] args) {
        Collection<String> c = Collections.unmodifiableCollection(new ArrayList<>(data));
        System.out.println(c);
        //下面的操作会抛出UnsupportedOperationException
//        c.add("one");

        List<String> a = Collections.unmodifiableList(new ArrayList<>(data));
        ListIterator<String> lit = a.listIterator();
        System.out.println(lit.next());
//        lit.add("one");

        Set<String> set = Collections.unmodifiableSet(new HashSet<>(data));
        System.out.println(set);

        Set<String> sortedSet = Collections.unmodifiableSortedSet(new TreeSet<>(data));

        Map<String, String> m = Collections.unmodifiableMap(new HashMap<>(Countries.capitals(6)));
        System.out.println(m);

        //for a SortedMap
        Map<String, String> sm = Collections.unmodifiableSortedMap(new TreeMap<>(Countries.capitals(6)));


    }
}
