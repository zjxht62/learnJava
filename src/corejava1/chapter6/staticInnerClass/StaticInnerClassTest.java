package corejava1.chapter6.staticInnerClass;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/27
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++) {
            d[i] = 100 * Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min=" + p.getFirst());
        System.out.println("max=" + p.getSecond());
    }


}

class ArrayAlg {
    /**
     * A pair of floating-point numbers
     * 静态内部类
     */
    public static class Pair {
        private double first;
        private double second;

        /**
         * constructs a pair from two folating-points numbers
         * @param f the first number
         * @param s the second number
         */
        public Pair(double f, double s) {
            first = f;
            second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    //静态方法构造内部静态类
    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }


}
