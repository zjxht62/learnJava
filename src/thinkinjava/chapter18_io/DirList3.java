package thinkinjava.chapter18_io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/28
 */
public class DirList3 {
    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
            for (String dirItem : list) {
                System.out.println(dirItem);
            }
        }
    }
//public static void main(String[] args) {
//    List<String> list = Arrays.asList("A B C".split(" "));
//    System.out.println(list);
//    list.add("haha");
//}
}
