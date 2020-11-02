package thinkinjava.chapter19_enumerated;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/11/2
 */
enum Search {
    HITHER, YON
}
public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER;//向上转型
//        e.values();//没有values()方法
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }
}
