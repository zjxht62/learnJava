package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/22
 */
public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {return label;}
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    //外部类方法返回内部类的引用
    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }
    // 外部类的非静态方法之外创建某个内部类的对象,必须具体指明这个对象的类型
    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        //定义内部类的引用
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }

}
