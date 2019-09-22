package headfirst.chapter4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/12
 */
public class sharpen {
    int calArea(int height, int width) {
        return height * width;
    }
    public static void main(String[] args) {
        sharpen sharpen = new sharpen();

        int a = sharpen.calArea(7, 12);
        short c = 7;
        sharpen.calArea(c, 15);
    }
}
