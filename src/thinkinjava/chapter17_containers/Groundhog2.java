package thinkinjava.chapter17_containers;

/**
 * 重载了hashCode()方法和equals()方法的Groundhog
 *
 * @author trevor.zhao
 * @date 2020/10/20
 */
public class Groundhog2 extends Groundhog {
    public Groundhog2(int number) {
        super(number);
    }
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Groundhog2 && (number == ((Groundhog2)obj).number);
    }
}
