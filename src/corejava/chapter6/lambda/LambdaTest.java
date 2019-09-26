package corejava.chapter6.lambda;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/26
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercuy", "Venus", "Earth", "Mars", "Jupter", "Saturn", "Uranus", "Nepture"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dirctionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);

    }
}
