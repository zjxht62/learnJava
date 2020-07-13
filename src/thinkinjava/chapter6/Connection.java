package thinkinjava.chapter6;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/9
 */
public class Connection {
    private static int count = 0;
    private int i = 0;
    private Connection() { System.out.println("Connection()");}
    // Allow creation via static method:
    static Connection makeConnection() {
        count++;
        return new Connection();
    }
    public static int howMany() { return count; }
    public String toString() {
        return ("Connection " + count);
    }
}
