package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/23
 */
class Parcel4 {
    private class PContents implements Contents {
        //由于是private的 所以只有Parcel4能访问
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    //protected只有Parcel4以及其子类还有Parcel4同包中的类
    protected class PDestination implements Destination {
        private String label;

        public PDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new Parcel4.PContents();
    }
}
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents contents = parcel4.contents();
        Destination destination = parcel4.destination("Tasmania");

    }
}
