package designPatterns.compositePattern.safety;

/**
 * 测试类
 */
public class CompositePatternTest {
    public static void main(String[] args) {
        //对于客户来说，要区分叶子节点构件和树枝节点构件了
        Composite c0 = new Composite();
        Composite c1 = new Composite();

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");

        c1.add(leaf2);
        c1.add(leaf3);
        c0.add(leaf1);
        c0.add(c1);

        c0.operation();

    }
}
