package thinkinjava.chapter8_polymorphism.music;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/14
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Node.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        tune(wind);
    }
}
