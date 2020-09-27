package thinkinjava.chapter14_typeinfo;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;
import net.mindview.util.Null;

import java.util.List;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/9/23
 */
public interface Robot {
    String name();
    String model();
    List<Operation> operations();

    class Test {
        public static void test(Robot r) {
            if (r instanceof Null) {
                System.out.println("[Null Robot]");
            }
            System.out.println("Robot name: " + r.name());
            System.out.println("Robot model: " + r.model());
            for (Operation operation : r.operations()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
