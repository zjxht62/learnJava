package headfirst.chapter7.modifier;

/**
 * public修饰符
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class PublicModifier {
    public String name;
    public String getName() {
        return name;
    }

    public PublicModifier(String name) {
        this.name = name;
    }
}
