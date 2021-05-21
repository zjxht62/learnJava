package designPatterns.strategyPattern;

/**
 * 制作西式煎饼的算法
 */
public class MakeWesternPancake implements MakePancakeBehavior {
    @Override
    public void makePancake() {
        System.out.println("制作西式煎饼，放番茄酱，洋葱和火腿");
    }
}
