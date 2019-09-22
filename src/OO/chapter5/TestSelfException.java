package OO.chapter5;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/17
 */
public class TestSelfException {
    public static void main(String[] args) {
        String str[] = {"Beijing", "", "8 * 9", "test"};
        for (int i = 0; i < str.length; i++) {
            try {
                thrower(str[i]);
                System.out.println("Test" + str[i] + "didn't throw an exception");

            } catch (Exception e) {
                System.out.println("Test" + str[i] + "threw a " + e.getClass() + "\n with message:" + e.getMessage());

            }
        }
    }

    public static int thrower(String s) throws TestException {
        try {
            if (s.equals("divide")) {
                int i = 0;
                return i / i;
            }
            if (s.equals("null")) {
                s = null;
                return s.length();
            }
            if (s.equals("test")) {
                throw new TestException("Test message");
            }
        } finally {
            System.out.println("[thrower(" + s + ")done]");
        }
        return 0;
    }
}
