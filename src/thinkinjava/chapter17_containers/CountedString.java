package thinkinjava.chapter17_containers;

import java.util.*;

//创建一个好的hashCode()方法
public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;

    public CountedString(String s) {
        this.s = s;
        created.add(s);
        //id是CountedString使用的此字符串的实例总数
        for (String s2 : created) {
            if (s2.equals(s)) {
                id++;
            }
        }
    }

    @Override
    public String toString() {
        return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString && s.equals(((CountedString) o).s) && id == ((CountedString) o).id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    public static void main(String[] args) {
        Map<CountedString, Integer> map = new HashMap();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i);
        }
        System.out.println(map);
        for (CountedString countedString : cs) {
            System.out.println("Looking up " + countedString);
            System.out.println(map.get(countedString));
        }
    }
}
