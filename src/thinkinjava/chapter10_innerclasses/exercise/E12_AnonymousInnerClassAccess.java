package thinkinjava.chapter10_innerclasses.exercise;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/27
 */
public class E12_AnonymousInnerClassAccess {
    private String privateString;
    private void f() {
        System.out.println("E12_AnonymousInnerClassAccess.f");
    }
    public void h() {
        new Object() {
            void g() {
                privateString = privateString + "modified by inner class";
                f();
            }
        }.g();
        System.out.println(privateString);
    }

    public static void main(String[] args) {
        E12_AnonymousInnerClassAccess ica = new E12_AnonymousInnerClassAccess();
        ica.h();
    }

}
