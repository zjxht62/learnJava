package headfirst.chapter11;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import javax.sound.midi.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/29
 */
public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp miniMiniMusicApp = new MiniMiniMusicApp();
        miniMiniMusicApp.play();
    }

    public void play() {
        try {
            //取得Sequence并将其打开
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);


            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(192, 1, 102, 100);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
