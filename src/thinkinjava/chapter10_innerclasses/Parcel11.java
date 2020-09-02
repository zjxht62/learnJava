package thinkinjava.chapter10_innerclasses;

/**
 * 嵌套类测试
 *
 * @author trevor.zhao
 * @date 2020/7/28
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        public ParcelDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return null;
        }

        //嵌套类可以包含其他静态元素
        public static void f() {};
        static int x = 10;
        static class AnotherLevel {
            public static void f() {};
            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }


}
