package headfirst.chapter2;

import java.util.logging.XMLFormatter;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/6/12
 */
public class DrumKitTestDrive {
    int size = 32;
    char initial = 'j';
    double d = 456.709;
    boolean isCrazy;

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
