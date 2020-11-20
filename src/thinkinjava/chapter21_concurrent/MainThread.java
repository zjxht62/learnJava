package thinkinjava.chapter21_concurrent;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/11/12
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
