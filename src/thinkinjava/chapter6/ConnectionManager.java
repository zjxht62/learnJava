package thinkinjava.chapter6;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/9
 */
public class ConnectionManager {
    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];
    {
        for(Connection x : ca)
            x = Connection.makeConnection();
    }
    public static Connection getConnection() {
        if(howManyLeft > 0)
            return ca[--howManyLeft];
        else {
            System.out.println("No more connections");
            return null;
        }
    }
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        System.out.println(cm.howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(cm.getConnection());
        System.out.println(howManyLeft);
    }
}
