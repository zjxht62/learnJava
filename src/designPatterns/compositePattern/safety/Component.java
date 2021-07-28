package designPatterns.compositePattern.safety;

/**
 * 抽象的构件类，安全式，将管理子节点的方法放到树枝节点构件中
 */
public abstract class Component {
    //将叶子节点和树枝节点构件都要实现的方法声明为抽象，要求其必须实现
    public abstract void operation();
}
