package headfirst.chapter7.modifier;

/**
 * Protected修饰符
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class ProtectedModifier {
    protected String name;

    protected String getName() {
        return name;
    }

    public ProtectedModifier(String name) {
        this.name = name;
    }
}
