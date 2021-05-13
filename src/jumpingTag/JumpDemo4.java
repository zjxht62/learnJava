package jumpingTag;

/**
 * java跳转标签demo retry
 *
 * @author trevor.zhao
 * @date 2020/12/17
 */
public class JumpDemo4 {
    public static void main(String[] args) {
        int count = 0;
        retry:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                count++;
                if (count == 3) {
                    //直接开始下次retry循环
                    continue retry;
                }
                System.out.print(count + " ");
            }
            System.out.print("i ");
        }
    }
}
//1 2 4 5 6 7 8 i