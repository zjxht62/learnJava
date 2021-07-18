package designPatterns.compositePattern.safety;

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

    //树枝节点实现管理子节点的方法
    public void add(Component c) {
        this.componentList.add(c);
    }

    public void remove(Component c) {
        this.componentList.remove(c);
    }

    public Component getChild(Integer i) {
        return this.componentList.get(i);
    }
}
