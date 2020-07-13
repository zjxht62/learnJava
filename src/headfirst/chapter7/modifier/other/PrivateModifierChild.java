package headfirst.chapter7.modifier.other;

import headfirst.chapter7.modifier.PrivateModifier;

/**
 *
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class PrivateModifierChild extends PrivateModifier {
    public PrivateModifierChild(String name) {
        super(name);
    }

    //不同包内的子孙类不能访问private的属性和方法

}
