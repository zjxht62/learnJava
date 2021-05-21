package designPatterns.strategyPattern;

/**
 * 北京的煎饼店
 */
public class PancakeShopInBeiJing extends PancakeShop {
    //通过构造函数，传入了制作山东煎饼的算法
    public PancakeShopInBeiJing() {
        super(new MakeShanDongPancake());
    }
}
