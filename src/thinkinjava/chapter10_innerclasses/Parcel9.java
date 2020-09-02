package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/24
 */
public class Parcel9 {
    //匿名内部类的参数必须是final的
    public Destination destination(final String dest) {
        String modified = dest + "娃哈哈";
        return new Destination() {
            private String label = modified;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("诶嘿嘿");
        System.out.println(d.readLabel());
    }
}
