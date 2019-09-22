package OO.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/2
 */
public class Box {
    private int length;
    private int width;
    private int height;

    public void setLength(int lengthValue) {
        length = lengthValue;
    }
    public void setWidth(int widthValue) {
        width = widthValue;
    }
    public void setHeight(int heightValue) {
        height = heightValue;
    }

    public void setBox(int lengthValue, int widthValue, int heightValue) {
        length = lengthValue;
        width = widthValue;
        height = heightValue;
    }
    
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}
