package thinkinjava.chapter13_strings;

import java.util.Scanner;

/**
 * 自定义Scanner的分隔符
 *
 * @author trevor.zhao
 * @date 2020/9/9
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}
