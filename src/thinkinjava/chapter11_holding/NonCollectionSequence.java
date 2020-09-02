package thinkinjava.chapter11_holding;

import thinkinjava.typeinfo.pets.Pet;
import thinkinjava.typeinfo.pets.Pets;

import java.util.Iterator;

/**
 * 直接通过public的方法提供iterator,和队列之间的耦合度最低
 *
 * @author trevor.zhao
 * @date 2020/8/19
 */
class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}
public class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> getIterator() {
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

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

