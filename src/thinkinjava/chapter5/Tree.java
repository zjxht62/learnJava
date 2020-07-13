package thinkinjava.chapter5;

import net.mindview.util.Print;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/3
 */
public class Tree {
    int height;

    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
    }

    public Tree(int initialHeight) {
        this.height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + "feet tall");
    }

    void info(String s) {
        System.out.println(s + "Tree is " + height + "feet tall");
    }

}
