package thinkinjava.chapter11_holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/14
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("src/thinkinjava/chapter11_holding/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
