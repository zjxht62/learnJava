package headfirst.chapter7.modifier;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class PublicModifierChild extends PublicModifier{
    public PublicModifierChild(String name) {
        super(name);
    }

    @Override
    public String getName() {
        String name = super.name;
        return super.getName();
    }


}
