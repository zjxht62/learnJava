package thinkinjava.chapter17_containers;

import net.mindview.util.Countries;

import java.awt.geom.FlatteningPathIterator;
import java.util.*;

/**
 * 一个hashedmap的示范
 *
 * @author trevor.zhao
 * @date 2020/10/21
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    //为哈希表大小选择质数，以实现均匀分布
    static final int SIZE = 997;
    //您不能拥有物理上的泛型阵列，但是可以向上转型一个
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);//替换旧的内容
                found = true;
                break;
            }
        }
        if (!found) {
            buckets[index].add(pair);
        }
        return oldValue;
    }

    public V get(Object key) {
        int index = Math.abs(key.hashCode() % SIZE);
        if (buckets[index] == null) return null;
        for (MapEntry<K, V> iPair : buckets[index]) {
            if (iPair.getKey().equals(key)) {
                return iPair.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) continue;
            for (MapEntry<K, V> mpair : bucket) {
                set.add(mpair);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());
    }
}
