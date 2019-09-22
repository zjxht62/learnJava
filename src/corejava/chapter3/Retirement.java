package corejava.chapter3;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/15
 */
public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retirement?");
        double goal = in.nextDouble();

        System.out.println("how much money you contribute every year");
        double payment = in.nextDouble();

        System.out.println("Interset rate in %");
        double intersetRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        //update account balance while goal isn't reached
        while (balance < goal) {
            //add this year's payment and interest
            balance += payment;
            double interest = balance * intersetRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("you can retire in " + years + "years.");

    }
}
