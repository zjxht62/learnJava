package thinkinjava.chapter19_enumerated;

import net.mindview.util.OSExecute;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * 通过反射解析枚举类
 *
 * @author trevor.zhao
 * @date 2020/11/2
 */
enum Explore {
    HERE, THERE
}
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        print("------ Analyzing " + enumClass + "------");
        print("Interfaces:");
        for (Type t : enumClass.getGenericInterfaces()) {
            print(t);
        }
        print("Base: " + enumClass.getSuperclass());
        print("Methods: ");
        Set<String> methods = new TreeSet<>();
        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }
        print(methods);
        return methods;
    }
    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        print("Explore.containsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
        printnb("Explore.removeAll(Enum): ");
        exploreMethods.removeAll(enumMethods);
        print(exploreMethods);

        //反编译enum
//        OSExecute.command("javap Explore");

    }
}
