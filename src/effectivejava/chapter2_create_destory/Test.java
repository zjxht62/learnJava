package effectivejava.chapter2_create_destory;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/11/20
 */
public class Test {
    public static void main(String[] args) {
        NutritionFacts.Builder builder = new NutritionFacts.Builder(1, 1);
        User user = new User.Builder("aaa").getResult();
        System.out.println(user);
        User.Builder ub = new User.Builder("bbb");
        ub.setSex("F").setAge(11);
        System.out.println(ub.getResult());

    }
}
