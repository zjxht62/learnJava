package emumdemo;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/14
 */
public enum PizzaStatus {
    ORDERED(1, "已接单"),
    READY(2, "备餐完成"),
    DELIVERED(3, "已送达");

    private int id;
    private String chineseName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    PizzaStatus(int id, String chineseName) {
        this.id = id;
        this.chineseName = chineseName;
    }

    public static void main(String[] args) {
        System.out.println(PizzaStatus.ORDERED.name());
        System.out.println(PizzaStatus.ORDERED);
        System.out.println(PizzaStatus.ORDERED.name().getClass());
        System.out.println(PizzaStatus.ORDERED.getClass());
        System.out.println(PizzaStatus.ORDERED.getChineseName());
    }


}
