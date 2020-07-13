package thinkinjava.chpter4;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/6/28
 */
public class PrimeNumberTest {
    static void primeNumber(int num){
        int a = 0;
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < i; j++) {
                if ((i % j == 0) && (j != 1) ){
                    a = 0;
                    break;
                } else {
                    a = i;
                }
            }
            if (a != 0) {
                System.out.println(a + ", ");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(5 % 9);
        System.out.println(3 % 9);

    }


}
