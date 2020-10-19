package thinkinjava.chapter17_containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 填充容器
 *
 * @author trevor.zhao
 * @date 2020/10/16
 */
class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);

        Collections.fill(list, new StringAddress("World!"));
        System.out.println(list);
    }

}
