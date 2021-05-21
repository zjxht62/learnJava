package designPatterns.strategyPattern;

/**
 * 制作山东大煎饼的算法
 */
public class MakeShanDongPancake implements MakePancakeBehavior {
    @Override
    public void makePancake() {
        System.out.println("制作山东大煎饼，大转盘，玉米面");
    }
}
