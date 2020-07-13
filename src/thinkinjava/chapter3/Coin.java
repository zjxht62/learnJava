package thinkinjava.chapter3;

import java.util.Random;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/24
 */
public class Coin {
    public static void main(String[] args) {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            System.out.println("正面");
        } else {
            System.out.println("反面");
        }
    }
}
