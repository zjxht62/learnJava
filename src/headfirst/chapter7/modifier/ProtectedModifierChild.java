package headfirst.chapter7.modifier;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class ProtectedModifierChild extends DefaultModifier {
    public ProtectedModifierChild(String name) {
        super(name);
    }

    //同一包内的子孙类可以访问procted修饰的属性和方法
    @Override
    String getName() {
        String name = super.name;
        return super.getName();
    }
}
