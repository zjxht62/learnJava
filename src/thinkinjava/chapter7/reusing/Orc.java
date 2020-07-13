package thinkinjava.chapter7.reusing;
import static net.mindview.util.Print.*;
/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/13
 */
class Villian {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villian(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}
public class Orc extends Villian{
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        //因为是protected所以可以通过子类调用
        set(name);
        this.orcNumber = orcNumber;
    }

    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        print(orc);
        orc.change("Bob", 19);
        print(orc);
    }
}
