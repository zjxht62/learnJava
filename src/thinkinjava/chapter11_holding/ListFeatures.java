package thinkinjava.chapter11_holding;


//: holding/ListFeatures.java
import thinkinjava.typeinfo.pets.*;

import javax.print.attribute.SupportedValuesAttribute;
import java.util.*;
import static net.mindview.util.Print.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);

        Hamster h = new Hamster();
        pets.add(h);
        System.out.println("2:" + pets);
        System.out.println("3:" + pets.contains(h));

        pets.remove(h);//按照对象移除
        Pet p = pets.get(2);
        System.out.println("4:" + p + " " + pets.indexOf(p));//获取下标

        Pet cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));

        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);

        pets.add(3, new Mouse());//插入一个元素
        System.out.println("9: " + pets);

        //截取子串
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + pets.containsAll(sub));

        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + pets.containsAll(sub));

        Collections.shuffle(sub, rand);//打乱
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));

        //复制List
        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        //在copy里只保留sub里面有的元素
        copy.retainAll(sub);
        System.out.println("13: " + copy);

        copy = new ArrayList<>(pets);
        copy.remove(2);
        System.out.println("14: " + copy);

        copy.removeAll(sub);
        System.out.println("15: " + copy);

        //替换一个元素
        copy.set(1, new Mouse());
        System.out.println("16: " + copy);

        //向中间插入一个list
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear();
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());

        pets.addAll(Pets.arrayList(4));
        System.out.println("21: " + pets);

        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        //有参的toArray方法,将产生指定数据类型的数组,
        // 如果参数里的数组大小不够,toArray方法将创建一个具有合适尺寸的数组
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23: " + pa[3].id());






    }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
