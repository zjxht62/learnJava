package thinkinjava.chapter17_containers;

import headfirst.chapter7.practice.C;

/**
 * 性能测试框架
 *
 * @author trevor.zhao
 * @date 2020/10/22
 */
public abstract class Test<C> {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    //在不同的测试中覆盖此方法
    //返回测试的实际重复次数
    abstract int test(C container, TestParam tp);
}
