package OO.chapter3;

import java.util.Objects;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/4
 */
public class Rect {
    private Point leftTop;
    private Point rightBottom;

    public Rect() {
        this.leftTop = new Point();
        this.rightBottom = new Point();
    }

    public Rect(int x1, int y1, int x2, int y2) {
        this.leftTop = new Point(x1, y1);
        this.rightBottom= new Point(x2, y2);
    }

    public Rect(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setLeftTop(int x, int y) {
        this.leftTop.setXY(x, y);
    }

    public void setRightBottom(int x, int y) {
        this.rightBottom.setXY(x, y);
    }

    @Override
    public String toString() {
        return leftTop.toString() + rightBottom.toString();
    }
}
