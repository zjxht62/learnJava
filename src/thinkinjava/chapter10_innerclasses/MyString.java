package thinkinjava.chapter10_innerclasses;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/22
 */
public class MyString {
    private String string;

    public MyString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "MyString{" +
            "string='" + string + '\'' +
            '}';
    }
}
