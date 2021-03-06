package corejava1.chapter9.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/10/7
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        //merge the words from b into a
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());

        }

        System.out.println(a);

        //remove every second word from b

        bIter = b.iterator();
        while (bIter.hasNext()) {
            //skip one element
            bIter.next();
            if (bIter.hasNext()) {
                //skip next element
                bIter.next();
                //remove that element
                bIter.remove();
            }
        }

        System.out.println(b);

        //bulk operation: remove all words in b from a

        a.removeAll(b);
        System.out.println(a);


    }
}
