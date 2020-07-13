package thinkinjava.chapter7;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/10
 */
public class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();
    }
    public void foam() {
        append("foam()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("Testing base class");
        Cleanser.main(args);
    }

}
