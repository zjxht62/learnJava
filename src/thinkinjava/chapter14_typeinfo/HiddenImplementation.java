package thinkinjava.chapter14_typeinfo;

import thinkinjava.chapter14_typeinfo.interfacea.A;
import thinkinjava.chapter14_typeinfo.packageaccess.HiddenC;

import java.lang.reflect.Method;

/**
 * 测试调用无法访问的方法
 *
 * @author trevor.zhao
 * @date 2020/9/23
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception{
        A a = HiddenC.makeA();
        System.out.println(a.getClass().getName());

        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
