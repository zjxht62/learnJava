package OO.chapter2;

import java.awt.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2018/12/28
 */
public class Bubble_Sort {
    public static final int ARRAY_MAX_LENGTH = 10;

    public static void main(String[] args) {
        int data[] = new int[ARRAY_MAX_LENGTH];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100);
        }
        System.out.println();
        for (int element : data) {
            System.out.printf("%4d", element);
        }

        sort(data);

        System.out.println();

        for (int element : data) {
            System.out.printf("%4d", element);
        }

    }
    public static void sort(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[j] < data[j - 1]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }

    }
}
