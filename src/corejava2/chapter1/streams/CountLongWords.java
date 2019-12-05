package corejava2.chapter1.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListResourceBundle;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/10/22
 */
public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("../gutenberg/alice30.txt")), StandardCharsets.UTF_8);

        // \\PL+  P指的是unicode标点字符 L指的是字母
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        long count = 0;
        for (String w : words) {
            if (w.length() > 12) {
                count++;
            }
        }

        System.out.println(count);

        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);

        //filter的参数是Predicate 专门用来传递lambda表达式
        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);

    }
}
