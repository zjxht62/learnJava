package headfirst.chapter7.modifier;

import headfirst.chapter7.modifier.DefaultModifier;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class DefaultModifierChild extends DefaultModifier {
    public DefaultModifierChild(String name) {
        super(name);
    }

    //同一包内的子孙类可以访问default修饰的属性和方法
    @Override
    String getName() {
        String name = super.name;
        return super.getName();
    }
}
