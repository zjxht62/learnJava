package thinkinjava.chapter11_holding.exercise;
/****************** Exercise 8 ******************
 * Modify Exercise 1 so it uses an Iterator to
 * move through the List while calling hop().
 ***********************************************/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author trevor.zhao
 * @date 2020/8/12
 */
public class E08_GerbilIterator {
    public static void main(String[] args) {
        List<Gerbil> gerbilList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbilList.add(new Gerbil(i));
        }
        System.out.println(gerbilList);

        Iterator<Gerbil> gerbilIterator = gerbilList.iterator();
        while (gerbilIterator.hasNext()) {
            Gerbil gerbil = gerbilIterator.next();
            gerbil.hop();
        }
    }
}
