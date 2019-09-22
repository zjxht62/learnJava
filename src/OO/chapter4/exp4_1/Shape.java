package OO.chapter4.exp4_1;


import java.awt.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/14
 */
public class Shape {
    private Color color;
    private Point place;

    public Shape() {
        color = new Color();
        place = new Point();
    }

    public Shape(Color color, Point place) {
        this.color = color;
        this.place = place;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getPlace() {
        return place;
    }

    public void setPlace(Point place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return color.toString() + "\n" + place.toString();
    }
}
