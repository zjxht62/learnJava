package thinkinjava.chapter8_polymorphism.music;

import static net.mindview.util.Print.print;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/14
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        print("Wind.play()");
    }
}
