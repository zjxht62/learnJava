package designPatterns.singletonPattern;

/**
 * 单例模式经典实现--懒加载
 *
 * @author trevor.zhao
 * @date 2021/6/18
 */
public class SingletonLazy {
    //使用一个私有的静态变量维护唯一实例
    private static SingletonLazy uniqueInstance;

    //私有的构造器，保证无法从外部实例化
    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (null == uniqueInstance) {
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }
}
