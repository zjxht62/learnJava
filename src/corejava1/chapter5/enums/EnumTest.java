package corejava1.chapter5.enums;

import java.util.Scanner;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/24
 */
public class EnumTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:(SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviration());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good Job--you paid attention to the _.");
        }
    }

}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviration) {
        this.abbreviration = abbreviration;
    }

    public String getAbbreviration() {
        return abbreviration;
    }

    private String abbreviration;
}
