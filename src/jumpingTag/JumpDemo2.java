package jumpingTag;

/**
 * java跳转标签demo break
 *
 * @author trevor.zhao
 * @date 2020/12/17
 */
public class JumpDemo2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                count++;
                if (count == 3) {
                    //跳出当前循环
                    break;
                }
                System.out.print(count + " ");
            }
        }
    }
}
//1 2 4 5 6 7 8