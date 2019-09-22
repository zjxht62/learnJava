package OO.chapter3.PointPackage;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/4
 */
public class Point {
    int x;
    int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int dx, int dy) {
        x = dx;
        y = dy;
    }

    public void setXY(int dx, int dy) {
        x = dx;
        y = dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    class Line {
        Point start;
        Point end;

        Line() {
            start = new Point();
            end = new Point();
        }
        public void setLine(Point p1, Point p2) {

        }
    }
}
