package thinkinjava.chapter11_holding.exercise;

import net.mindview.util.TextFile;

import java.util.Arrays;
import java.util.HashSet;

/**
 /****************** Exercise 16 *****************
 * Create a Set of the vowels. Working from
 * UniqueWords.java, count and display the number of
 * vowels in each input word, and also display the
 * total number of vowels in the input file.
 ****************************************
 * @author trevor.zhao
 * @date 2020/8/16
 */
public class E16_Vowels {
    private static final HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public static void main(String[] args) {
        HashSet<String> processedWords = new HashSet<>();
        int fileVowels = 0;
        int wordVowels;
        for (String word : new TextFile("src/thinkinjava/chapter11_holding/SetOperations.java", "\\W+")) {
            wordVowels = 0;
            for (char letter : word.toCharArray()) {
                if (vowels.contains(letter)) {
                    wordVowels++;
                }
            }
            if (!processedWords.contains(word)) {
                processedWords.add(word);
                System.out.println(word + " has " + wordVowels + "vowel(s)");
            }
            fileVowels += wordVowels;
        }
        System.out.println("Total number of vowels in file: " + fileVowels);
    }
}
