package corejava.chapter5.objectAnalyzer;

import com.sun.deploy.panel.ITreeNode;

import java.util.ArrayList;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/25
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new objectAnalyzer().toString(squares));
    }
}
