package thinkinjava.chapter17_containers;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/20
 */
public class Groundhog {
    protected int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog #" + number;
    }
}
