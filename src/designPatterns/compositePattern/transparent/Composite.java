package designPatterns.compositePattern.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合，也就是树枝节点
 */
public class Composite extends Component {
    private List<Component> componentList = new ArrayList<>();

    //递归得调用子节点的operation方法
    @Override
    public void operation() {
        for(Component cmp : componentList){
            cmp.operation();
        }
    }

    //实现管理子节点的方法
    @Override
    public void add(Component c) {
        this.componentList.add(c);
    }

    @Override
    public void remove(Component c) {
        this.componentList.remove(c);
    }

    @Override
    public Component getChild(Integer i) {
        return this.componentList.get(i);
    }
}
