package thinkinjava.chapter13_strings;

import java.util.Scanner;

/**
 * Scanner类demo
 *
 * @author trevor.zhao
 * @date 2020/9/9
 */
public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old are you? What is your favorite double");
        System.out.println("(input : <age> <double>)");
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s.\n", name);
        System.out.printf("In 5 years you will be %d.\n", age + 5);
        System.out.printf("My favorite double is %f", favorite);
    }
}
