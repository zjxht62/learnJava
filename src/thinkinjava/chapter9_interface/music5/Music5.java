package thinkinjava.chapter9_interface.music5;

import thinkinjava.chapter8_polymorphism.music.Note;

import static net.mindview.util.Print.print;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/20
 */
interface Instrument {
    int VALUE = 5;//static & final

    void play(Note n);

    void adjust();
}

class Wind implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play" + n);
    }

    @Override
    public String toString() {
        return "Wind{}";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Percussion implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play" + n);
    }

    @Override
    public String toString() {
        return "Percussion{}";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");

    }
}

class Stringed implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play" + n);
    }

    @Override
    public String toString() {
        return "Stringed{}";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");

    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass{}";
    }
}

class WoodWind extends Wind {
    @Override
    public String toString() {
        return "WoodWind{}";
    }
}

public class Music5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[] {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new WoodWind(),
        };
        tuneAll(orchestra);
    }
}
