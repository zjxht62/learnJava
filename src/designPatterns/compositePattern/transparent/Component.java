package designPatterns.compositePattern.transparent;

/**
 * 抽象的构件类
 */
public abstract class Component {
    //将叶子节点和树枝节点构件都要实现的方法声明为抽象，要求其必须实现
    public abstract void operation();

    //管理子节点的方法的默认实现是抛异常
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component c){
        throw new UnsupportedOperationException();
    }

    public Component getChild(Integer i){
        throw new UnsupportedOperationException();

    }
}
