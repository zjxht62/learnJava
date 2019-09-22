package headfirst.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/10
 */
public class Dog {
    String name;

    public void bark() {
        System.out.println(name + "says Ruff!");
    }

    public void eat() {

    }

    public void chaseCat() {

    }

    public static void main(String[] args) {
        //创建dog对象
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //创建dog数组
        Dog[] mydogs = new Dog[3];

        //关门放狗
        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;

        mydogs[0].name = "Fred";
        mydogs[1].name = "Merge";

        System.out.println("the last dog's name is ");
        System.out.println(mydogs[2].name);

        int x = 0;
        while (x < mydogs.length) {
            mydogs[x].bark();
            x = x + 1;
        }
    }
}
