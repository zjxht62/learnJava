package OO.chapter3;

import com.sun.deploy.panel.ITreeNode;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/4
 */
public class Point {
    private int x;
    private int y;

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
}
