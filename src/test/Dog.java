package test;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/5/11
 */
public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("小狗汪汪叫");
    }

    @Override
    public String returntype() {
        return null;
    }


    //被重载的方法
    public String fun1(String a, int b) {
        return null;
    }

    //重载 返回类型不变，参数列表变
    public String fun1(int b, String a) {
        return null;
    }

    //报错，方法签名重复
    public String fun1(String a, String b) {
        return null;
    }


    //重载
    public String fun1(String a) {
        return null;
    }

    //重载
    public Integer fun1(int a) {
        return null;
    }

    public String fun2(String a, int b) {
        return super.fun2("asdf", 1) + "haha";
    }
}
