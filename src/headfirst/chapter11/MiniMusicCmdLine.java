package headfirst.chapter11;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.sound.midi.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/30
 */
public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine miniMusicCmdLine = new MiniMusicCmdLine();
        miniMusicCmdLine.play(12, 12);
    }
    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
