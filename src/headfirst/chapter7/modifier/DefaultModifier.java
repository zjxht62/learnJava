package headfirst.chapter7.modifier;

/**
 * Default修饰符
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
class DefaultModifier {
    String name;

    String getName() {
        return name;
    }

    public DefaultModifier(String name) {
        this.name = name;
    }
}
