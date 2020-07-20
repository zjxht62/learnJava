package thinkinjava.chapter9_interface.music4;

import thinkinjava.chapter8_polymorphism.music.Note;

import java.awt.print.PrinterGraphics;
import java.util.prefs.NodeChangeEvent;

import static net.mindview.util.Print.print;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/17
 */
abstract class Instrument {
    private int i;
    public abstract void play(Note note);
    public String what() {
        return "Instrument";
    }
    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note note) {
        print("Wind.play() " + note);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        print("Percussion.play()" + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}
class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        print("Stringed.play()" + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}

class Brass extends Wind {
    @Override
    public void play(Note note) {
        print("Brass.play()" + note);
    }

    @Override
    public String what() {
        return "Brass";
    }

    @Override
    public void adjust() {
        print("Brass.adjust()");
    }
}

class WoodWind extends Wind {
    @Override
    public void play(Note note) {
        print("WoodWind.play()" + note);
    }

    @Override
    public String what() {
        return "WoodWind";
    }


}
public class Music4 {
    static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[] {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new WoodWind(),
        };

        tuneAll(instruments);
    }
}
