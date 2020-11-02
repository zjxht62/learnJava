package thinkinjava.chapter19_enumerated;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * 枚举类型的是demo
 *
 * @author trevor.zhao
 * @date 2020/11/2
 */
enum Shrubbery {GROUND, CRAWLING, HANGING}

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            //oridinal()方法返回int值,是enum实例在声明时候的顺序,从0开始
            print(s + " ordinal: " + s.ordinal());
            printnb(s.compareTo(Shrubbery.CRAWLING) + " ");
            printnb(s.equals(Shrubbery.CRAWLING) + " ");
            print(s == Shrubbery.CRAWLING);
            print(s.getDeclaringClass());
            //name()方法返回声明时的名字
            print(s.name());
            print("--------------------------");
        }
        //
        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            //静态方法valueOf()根据给定的名字返回相应的enum实例,找不到会抛出异常
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            //默认调用toString()也会打印出实例声明时的名字
            print(shrub);
        }
    }
}
