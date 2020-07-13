package headfirst.chapter7.modifier;

/**
 * 测试同一个包访问
 *
 * @author trevor.zhao
 * @date 2020/3/26
 */
public class TestSamePackage {
    public static void main(String[] args) {
        DefaultModifier defaultModifier = new DefaultModifier("default");
        PrivateModifier privateModifier = new PrivateModifier("private");
        PublicModifier publicModifier = new PublicModifier("public");
        ProtectedModifier protectedModifier = new ProtectedModifier("protested");

        //测试public访问修饰符
        System.out.println(publicModifier.name);
        publicModifier.getName();

        //测试Protected访问修饰符
        System.out.println(protectedModifier.name);
        protectedModifier.getName();

        //测试default访问修饰符
        System.out.println(defaultModifier.name);
        defaultModifier.getName();

        //测试private访问修饰符 无法访问对应的属性和方法
//        System.out.println(privateModifier.name);
//        privateModifier.getName();


    }



}
