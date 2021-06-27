package designPatterns.adapterPattern;

/**
 * 火鸡适配器，实现目标接口
 */
public class TurkyAdapter implements Duck {
    /**
     * 维护一个适配者
     */
    private Turkey turkey;

    public TurkyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * 实现目标接口的方法，委托给适配者
     */
    @Override
    public void quack() {
        this.turkey.gobble();

    }

    /**
     * 实现目标接口的方法，委托给适配者
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }
}
