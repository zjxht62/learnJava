package thinkinjava.chapter14_typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理Demo
 *
 * @author trevor.zhao
 * @date 2020/9/23
 */
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
            ".method: " + method + ", args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println("  " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}
public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        //插入一个proxy再次调用
        //Proxy.newProxyInstance方法创建动态代理，需要获取一个类加载器，一个你希望该代理实现的interface列表（不是类或者抽象类），以及InvocationHandler接口的一个实现
        Interface proxy = (Interface) Proxy.newProxyInstance(
            Interface.class.getClassLoader(),
            new Class[] {Interface.class},
            new DynamicProxyHandler(real)
        );
        consumer(proxy);
    }
}
