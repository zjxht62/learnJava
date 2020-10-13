package thinkinjava.chapter15_generics.coffee;

//泛型方法Demo
public class GenericMethods {
    public <T, U> void f(T x, U u, String z) {
        System.out.println(x.getClass().getName());
        System.out.println(u.toString());
        System.out.println("Z:" + z);
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", "", "123");
        gm.f(1, 1, "123");
//        gm.f(1.0, 1.0);
//        gm.f(1.0F, 1.0F);
//        gm.f('c', 'c');
//        gm.f(gm, gm);
    }
}
