package thinkinjava.chapter7;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/10
 */
public class WashingPowder extends Detergent {
    @Override
    public void scrub() {
        append("Washing Powder.scrub()");
        super.scrub();
    }
    public void sterllize() {
        append("sterllize()");
    }

    public static void main(String[] args) {
        WashingPowder washingPowder = new WashingPowder();
        washingPowder.apply();
        washingPowder.scrub();
        washingPowder.sterllize();
        System.out.println(washingPowder);
    }
}
