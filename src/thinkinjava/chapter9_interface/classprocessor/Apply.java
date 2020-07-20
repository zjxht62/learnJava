package thinkinjava.chapter9_interface.classprocessor;

import com.sun.xml.internal.ws.api.server.ServerPipelineHook;

import java.util.Arrays;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printf;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/20
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}
class Upcase extends Processor {
    //协变返回类型 子类可以返回父类返回类型的子类
    @Override
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor {
    @Override
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}
