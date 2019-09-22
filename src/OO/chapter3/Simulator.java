package OO.chapter3;

import java.util.Random;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/7
 */
public class Simulator {
    public static void main(String[] args) {
        Random diceValues = new Random();

        String theThrow[] = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth"};
        int die1 = 0;
        int die2 = 0;
        System.out.println("你可以开始扔骰子了");
        for (int i = 0; i < 6; i++) {
            die1 = 1 + diceValues.nextInt(6);
            die2 = 1 + diceValues.nextInt(6);
            System.out.println("第" + theThrow[i] + die1 + " " + die2);
            if (die1 + die2 == 12) {
                System.out.println("666你赢了");
                return;
            }
        }
        System.out.println("你个非洲人");
        return;
    }
}
