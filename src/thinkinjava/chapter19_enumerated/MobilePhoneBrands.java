package thinkinjava.chapter19_enumerated;

/**
 * 带有方法的枚举类
 *
 * @author trevor.zhao
 * @date 2020/11/2
 */
public enum  MobilePhoneBrands {
    APPLE("iPhone就是垃圾"), HUAWEI("华为牛逼"), ONEPLUS("不将就"), XIAOMI("永远相信美好的事情即将发生");

    private String description;

    //构造器必须是private 保证每一个枚举类元素的唯一实例
    MobilePhoneBrands(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    //覆盖枚举方法
    @Override
    public String toString() {
        return "手机品牌" + name();
    }

    public static void main(String[] args) {
        for (MobilePhoneBrands mpb : MobilePhoneBrands.values()) {
            System.out.println(mpb + ": " + mpb.getDescription());
        }
    }


}
