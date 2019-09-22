package OO.chapter2;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2018/12/29
 */
public class YangHui {
    public static void main(String[] args) {
        int data[][] = new int[10][];

        for (int i = 0; i < 10; i++) {
            data[i] = new int[i + 1];
        }

        data[0][0] = 1;
        for (int i = 1; i < 10; i++) {
            data[i][0] = 1;
            for (int j = 1; j < i; j++) {
                data[i][j] = data[i - 1][j - 1] + data[i - 1][j];
            }
            data[i][i] = 1;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", data[i][j]);
            }
            System.out.println();
        }
    }
}
