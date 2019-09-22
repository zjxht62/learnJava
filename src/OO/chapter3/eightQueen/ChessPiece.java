package OO.chapter3.eightQueen;

import java.awt.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/9
 */
public class ChessPiece {
    private int No;
    private Point point;

    public ChessPiece() {
        No = 0;
        point = new Point(0, 0);
    }

    public ChessPiece(int No) {
        this.No = No;
        point = null;
    }

    public ChessPiece(int No, int x, int y) {
        this.No = No;
        point = new Point(x, y);
    }

    public ChessPiece(int No, Point p) {
        this.No = No;
        point = p;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "(" + point.getX() + ", " + point.getY() + ")";
    }
}
