package designPatterns.decoratorPattern;

/**
 * 喜茶店卖饮料
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public class HeyTeaShop {
    public static void main(String[] args) {
        //先new一个金凤茶王
        Beverage zhiZhiJinFengChaWang = new JinFengChaWang();
        //用奶盖包装起来
        zhiZhiJinFengChaWang = new NaiGaiDecorator(zhiZhiJinFengChaWang);
        System.out.println(zhiZhiJinFengChaWang.getCost());
        System.out.println(zhiZhiJinFengChaWang.getDescription());

        //用两个装饰器包装起来
        Beverage boBazhiZhiLvYan = new BobaDecorator(new NaiGaiDecorator(new LvYan()));
        System.out.println(boBazhiZhiLvYan.getCost());
        System.out.println(boBazhiZhiLvYan.getDescription());    }
}
