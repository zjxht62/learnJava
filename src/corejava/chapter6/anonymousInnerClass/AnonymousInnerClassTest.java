package corejava.chapter6.anonymousInnerClass;

import headfirst.chapter15.DailyAdviceClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/26
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock {
    public void start(int interval, boolean beep) {
        //匿名内部类
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone the time is " + new Date());
                //访问传入的参数beep
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer timer = new Timer(interval, listener);
        timer.start();


    }
}
