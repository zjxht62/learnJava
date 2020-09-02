package thinkinjava.chapter11_holding;

import thinkinjava.typeinfo.pets.Pet;
import thinkinjava.typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * ListIteration
 *
 * @author trevor.zhao
 * @date 2020/8/13
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + ";");
        }
        System.out.println();
        //反向遍历
        while (it.hasPrevious()) {
            System.out.println(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);

        //从下标为3开始获取迭代器
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
