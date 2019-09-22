package headfirst.chapter11;
import javax.sound.midi.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/29
 */
public class MusicTest1 {
    public void play() {
        //将有风险的代码放在try块内
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
            //用catch块处理异常
        } catch (MidiUnavailableException ex) {
            System.out.println("Bummer");
        }
    }

    public static void main(String[] args) {
        MusicTest1 m1 = new MusicTest1();
        m1.play();
    }

}
