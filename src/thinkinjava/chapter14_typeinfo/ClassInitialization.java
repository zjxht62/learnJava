package thinkinjava.chapter14_typeinfo;

import com.sun.xml.internal.messaging.saaj.soap.SOAPVersionMismatchException;

import java.util.Random;

/**
 * 当使用".class"来创建对Class对象的引用时,不会自动地初始化该Class对象.为了使用类而做的准备工作实际包括三个步骤
 * 1.加载 这是由类加载器执行的.该步骤将查找字节码,并从这些字节码中创建一个Class对象
 * 2.链接 在链接阶段将验证雷沃中的字节码.为静态域分配存储空间,并且如果必须的话,将解析这个类创建的对其他类的所有引用
 * 3.初始化 如果该类具有超类,则对其初始化,执行静态初始化器和静态初始化块
 *
 * 初始化被延迟到了对静态方法(构造器隐式地是静态的)或者非常数静态域进行首次引用时才执行
 *
 * @author trevor.zhao
 * @date 2020/9/13
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        //没有触发初始化
        System.out.println(Initable.staticFinal);
        //触发了初始化
        System.out.println(Initable.staticFinal2);
        //触发了初始化
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("thinkinjava.chapter14_typeinfo.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
//初始化有效的实现了惰性,在创建initable引用的时候,仅仅使用.class语法来获得对类的引用不会引发初始化.但是为了产生Class引用,Class.forName()立即就进行了初始化
