package headfirst.chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/31
 */
public class TextArea1 implements ActionListener {
    JTextArea text;

    public static void main(String[] args) {
        TextArea1 textArea1 = new TextArea1();
        textArea1.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        JButton button = new JButton("Just Click Me");
        //this 指的是本类
        button.addActionListener(this);
        text = new JTextArea(10, 20);
        text.setLineWrap(true);

        //为文本框加上滚动条
        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //panel里加上带滚动条的文本框
        jPanel.add(scroller);

        //frame里加入刚刚的panel
        frame.getContentPane().add(BorderLayout.CENTER, jPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.append("button clicked \n");
    }
}
