package designPatterns.strategyPattern;

/**
 * 制作天津煎饼果子的算法
 */
public class MakeTianJinPancake implements MakePancakeBehavior {
    @Override
    public void makePancake() {
        System.out.println("制作天津煎饼，夹果子");
    }
}
