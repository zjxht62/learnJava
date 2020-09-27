package thinkinjava.chapter14_typeinfo;

import net.mindview.util.Null;

/**
 * 用来测试空对象的Person类
 *
 * @author trevor.zhao
 * @date 2020/9/23
 */
public class Person {
    public final String first;
    public final String last;
    public final String address;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    public static class NullPerson extends Person implements Null {
        @Override
        public String toString() {
            return "NullPerson";
        }

        private NullPerson() {
            super("None", "None", "None");

        }
    }
    public static final Person NULL = new NullPerson();
}
