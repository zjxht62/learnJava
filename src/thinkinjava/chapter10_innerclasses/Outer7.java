package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/24
 */
public class Outer7 {
    private String privateName = "诶嘿嘿";

    private String getPrivateName() {
        return privateName;
    }

    class Inner7 {
        void changeOuter(String name) {
            Outer7.this.privateName = name;
            System.out.println(getPrivateName());
        }
    }

    public void Inner7() {
        new Inner7().changeOuter("哇哈哈");
    }

    public static void main(String[] args) {
        Outer7 outer7 = new Outer7();
        System.out.println(outer7.getPrivateName());
        outer7.Inner7();
    }


}
