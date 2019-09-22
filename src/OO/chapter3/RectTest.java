package OO.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/4
 */
public class RectTest {
    public static void main(String[] args) {
        Rect r1, r2;
        Point p1, p2;
        r1 = new Rect(10, 20, 30, 40);
        p1 = new Point();
        p2 = new Point(100, 100);
        r2 = new Rect(p1, p2);
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
    }
}
