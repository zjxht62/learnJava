package corejava1.chapter6.lambda;

import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.util.function.IntConsumer;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/26
 */
public class LambdaTest {
    public static void main(String[] args) {
        /*
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
        */


        reprat(10, (i) -> System.out.println("Fuck you Ford for " + i + "times"));

    }
    public static void reprat(int times, IntConsumer intConsumer) {
        for (int i= 0; i < times; i++) {
            intConsumer.accept(i);
        }
    }
}
