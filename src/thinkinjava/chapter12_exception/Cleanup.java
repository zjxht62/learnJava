package thinkinjava.chapter12_exception;

/**
 * 保证资源被合理地释放
 *
 * @author trevor.zhao
 * @date 2020/9/2
 */
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) {
                    //一些处理代码
                }
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("构造器出现异常");
        }
    }
}
