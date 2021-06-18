package designPatterns.singletonPattern;

/**
 * 单例模式经典实现--即时加载
 *
 * @author trevor.zhao
 * @date 2021/6/18
 */
public class SingletonNow {
    //使用一个私有的静态变量维护唯一实例
    private static SingletonNow uniqueInstance = new SingletonNow();

    //私有的构造器，保证无法从外部实例化
    private SingletonNow() {}

    public static SingletonNow getInstance() {
        return uniqueInstance;
    }
}
