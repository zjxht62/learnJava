package OO.chapter4.exp4_1;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/14
 */
public class Color {
    private int red;
    private int green;
    private int blue;

    public Color() {
        red = 0;
        green = 0;
        blue = 0;
    }

    public Color(int red, int green, int blue) {
        if (red < 0 || red > 255) {
            this.red = 0;
        } else {
            this.red = red;
        }
        if (green < 0 || green > 255) {
            this.green = 0;
        } else {
            this.green = green;
        }
        if (blue < 0 || blue > 255) {
            this.blue = 0;
        } else {
            this.blue = blue;
        }
    }

    public void setColor(int red, int green, int blue) {
        if (red < 0 || red > 255) {
            this.red = 0;
        } else {
            this.red = red;
        }
        if (green < 0 || green > 255) {
            this.green = 0;
        } else {
            this.green = green;
        }
        if (blue < 0 || blue > 255) {
            this.blue = 0;
        } else {
            this.blue = blue;
        }
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return "Red:" + red + ",Green:" + green + ",Blue:" + blue;
    }
}
