package thinkinjava.chapter17_containers;

/**
 * String的hashcode
 *
 * @author trevor.zhao
 * @date 2020/10/21
 */
public class StringHashCode {
    public static void main(String[] args) {
        String[] hellos = "Hello Hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
    }
}
