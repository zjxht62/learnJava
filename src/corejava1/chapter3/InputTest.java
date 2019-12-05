package corejava1.chapter3;

import java.util.Scanner;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/10
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //get first input
        System.out.println("What is your name");
        String name = in.nextLine();

        //get second input
        System.out.println("How old are you");
        Integer age = in.nextInt();

        //display on console
        System.out.println("Hello " + name + ". next year you will be " + (age + 1));
    }
}
