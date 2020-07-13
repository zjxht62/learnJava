package thinkinjava.chapter7.reusing;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/12
 */
public class SpaceShipControls {
    void up(int velocity) {}
    void down(int velocity) {}
    void left(int velocity) {}
    void right(int velocity) {}
    void forward(int velocity) {
        System.out.println("forward" + velocity);
    }
    void back(int velocity) {}
    void turboBoot() {}
}
