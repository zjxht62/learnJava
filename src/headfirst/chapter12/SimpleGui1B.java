package headfirst.chapter12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/30
 */
//实现actionListener接口 事件只会通知实现actionListener的类
public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B simpleGui1B = new SimpleGui1B();
        simpleGui1B.go();

    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        //向按钮注册
        button.addActionListener(this);


        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
    //实现接口的方法 对事件进行处理
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");

    }
}
