package headfirst.chapter2;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/6/11
 */
public class Player {
    int number = 0;

    public void guess() {
        number = (int)(Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
