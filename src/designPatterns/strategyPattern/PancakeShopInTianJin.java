package designPatterns.strategyPattern;

/**
 * 天津的煎饼店
 */
public class PancakeShopInTianJin extends PancakeShop {
    //通过构造函数，传入了制作天津煎饼果子的算法
    public PancakeShopInTianJin() {
        super(new MakeTianJinPancake());
    }


}
