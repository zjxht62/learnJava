package jumpingTag;

/**
 * java跳转标签demo retry
 *
 * @author trevor.zhao
 * @date 2020/12/17
 */
public class JumpDemo3 {
    public static void main(String[] args) {
        int count = 0;
        retry:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                count++;
                if (count == 3) {
                    //跳出retry循环
                    break retry;
                }
                System.out.print(count + " ");
            }
        }
    }
}
//1 2