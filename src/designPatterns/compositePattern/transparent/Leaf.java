package designPatterns.compositePattern.transparent;

/**
 * 叶子节点构件
 */
public class Leaf extends Component{
    private String name;
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
