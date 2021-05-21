package designPatterns.strategyPattern;

public class PanCakeShopTest {
    public static void main(String[] args) {
        PancakeShop TJShop = new PancakeShopInTianJin();
        TJShop.sellPancake();
        //制作天津煎饼，夹果子

        PancakeShop BJShop = new PancakeShopInBeiJing();
        BJShop.sellPancake();
        //制作山东大煎饼，大转盘，玉米面

        //通过策略模式可以快速替换算法，比如北京的煎饼店创新了，改做西式煎饼了
        BJShop.setMakePancakeBehavior(new MakeWesternPancake());
        BJShop.sellPancake();
        //制作西式煎饼，放番茄酱，洋葱和火腿

    }
}
