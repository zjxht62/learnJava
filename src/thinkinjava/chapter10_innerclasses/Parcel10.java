package thinkinjava.chapter10_innerclasses;

import java.util.concurrent.CompletionStage;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/27
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            //实例初始化
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        Destination d = parcel10.destination("Tasmania", 101.395f);
    }
}
