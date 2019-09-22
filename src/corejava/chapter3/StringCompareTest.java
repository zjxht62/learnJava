package corejava.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/10
 */
public class StringCompareTest {
    public static void main(String args[]) {
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";

        int result = str1.compareTo( str2 );
        System.out.println(result);

        // 如果字符串位于参数之前 返回负数
        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);

        result = str1.indexOf("ng");
        System.out.println(result);

        result = str1.indexOf("ng");
        System.out.println(result);
    }
}
