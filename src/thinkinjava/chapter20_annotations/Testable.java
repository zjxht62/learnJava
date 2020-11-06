package thinkinjava.chapter20_annotations;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/11/6
 */
public class Testable {
    public void execute() {
        System.out.println("Executing");
    }
//    @Test
    void testExecute() {
        execute();
    }
}
