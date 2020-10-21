package thinkinjava.chapter17_containers;

import com.sun.jnlp.JNLPRandomAccessFileNSBImpl;

import java.util.Random;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/20
 */
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > 0.5;

    @Override
    public String toString() {
        if (shadow) {
            return "Six more weeks of Winter!";
        } else {
            return "Early Spring!";
        }
    }
}
