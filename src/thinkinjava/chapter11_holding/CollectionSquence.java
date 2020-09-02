package thinkinjava.chapter11_holding;

import thinkinjava.typeinfo.pets.Pet;
import thinkinjava.typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * 通过继承AbstractCollection类来提供iterator,但是需要实现AbstractCollection类的抽象方法iterator()和size()
 *
 * @author trevor.zhao
 * @date 2020/8/19
 */
public class CollectionSquence extends AbstractCollection<Pet> {
    private Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }



    public static void main(String[] args) {
        CollectionSquence c = new CollectionSquence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
