package thinkinjava.chapter7.reusing;


/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/12
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name) {
        this.name = name;
    }
    //代理的方法
    public void back(int velocity) {
        controls.back(velocity);
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void turboBoot() {
        controls.turboBoot();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("哈哈号宇宙飞船");
        protector.forward(100);
    }
}
