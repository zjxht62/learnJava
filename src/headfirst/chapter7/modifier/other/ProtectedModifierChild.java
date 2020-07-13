package headfirst.chapter7.modifier.other;


import headfirst.chapter7.modifier.ProtectedModifier;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class ProtectedModifierChild extends ProtectedModifier {
    public ProtectedModifierChild(String name) {
        super(name);
    }

    //不同包内的子孙类可以访问procted修饰的属性和方法
    @Override
    protected String getName() {
        String name = super.name;
        return super.getName();
    }
}
