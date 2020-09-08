package thinkinjava.chapter13_strings;

import sun.java2d.pipe.OutlineTextRenderer;

import javax.swing.text.DefaultFormatterFactory;
import java.io.PrintStream;
import java.util.Formatter;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at(%d, %d)", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlisa = System.out;
        Turtle tommy = new Turtle("tommy", new Formatter(System.out));
        Turtle terry =  new Turtle("terry", new Formatter(outAlisa));
        tommy.move(0, 0);
        terry.move(4, 8);



    }
}
