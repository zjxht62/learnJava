package OO.chapter2;


/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2018/12/27
 */
public class TestArray {
    public static void main(String[] args) {
        int elements[] = {10, 9, 40, 20, 12, 8, 9};
        for (int i = 0; i < elements.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j]<elements[index]) {
                    index = j;
                }
                if (index != i) {
                    int temp = elements[index];
                    elements[index] = elements[i];
                    elements[i] = temp;
                }
            }
        }

        int array_src[]= {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int array_dest[]= new int[10];
        System.arraycopy(array_src, 3, array_dest, 5, 3);
    }
}
