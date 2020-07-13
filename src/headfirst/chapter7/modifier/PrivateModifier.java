package headfirst.chapter7.modifier;

/**
 * Private修饰符
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class PrivateModifier {
    private String name;
    private String getName() {
        return name;
    }

    public PrivateModifier(String name) {
        this.name = name;
    }
}
