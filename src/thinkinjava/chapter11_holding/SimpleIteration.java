package thinkinjava.chapter11_holding;

import thinkinjava.typeinfo.pets.Pet;
import thinkinjava.typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * Iteration迭代器demo
 *
 * @author trevor.zhao
 * @date 2020/8/12
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
        for (Pet p : pets) {
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
        //用迭代器移除元素
        it = pets.iterator();
        while (it.hasNext()) {
            //iterator可以移除由next()产生的最后一个元素
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
