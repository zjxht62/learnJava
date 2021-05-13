package jumpingTag;

/**
 * java跳转标签demo
 *
 * @author trevor.zhao
 * @date 2020/12/17
 */
public class JumpDemo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                count++;
                System.out.print(count + " ");
            }
        }
    }
}

//1 2 3 4 5 6 7 8 9 10
