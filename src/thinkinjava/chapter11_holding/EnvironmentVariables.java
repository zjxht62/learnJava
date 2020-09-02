package thinkinjava.chapter11_holding;

import java.util.Map;

/**
 * 显示所有环境变量
 *
 * @author trevor.zhao
 * @date 2020/8/19
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
