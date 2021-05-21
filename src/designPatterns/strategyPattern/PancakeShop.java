package designPatterns.strategyPattern;

/**
 * 煎饼店，抽象类不能被实例化
 */
public abstract class PancakeShop {
    private MakePancakeBehavior makePancakeBehavior;

    public PancakeShop(MakePancakeBehavior makePancakeBehavior) {
        this.makePancakeBehavior = makePancakeBehavior;
    }

    public void setMakePancakeBehavior(MakePancakeBehavior makePancakeBehavior) {
        this.makePancakeBehavior = makePancakeBehavior;
    }

    public void sellPancake() {
        makePancakeBehavior.makePancake();
    }
}
