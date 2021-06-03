package designPatterns.decoratorPattern;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2021/6/3
 */
public class HeyTeaShop {
    public static void main(String[] args) {
        Beverage zhiZhiJinFengChaWang = new JinFengChaWang();
        zhiZhiJinFengChaWang = new NaiGaiDecorator(zhiZhiJinFengChaWang);
        System.out.println(zhiZhiJinFengChaWang.getCost());
        System.out.println(zhiZhiJinFengChaWang.getDescription());

        Beverage boBazhiZhiLvYan = new BobaDecorator(new NaiGaiDecorator(new LvYan()));
        System.out.println(boBazhiZhiLvYan.getCost());
        System.out.println(boBazhiZhiLvYan.getDescription());    }
}
