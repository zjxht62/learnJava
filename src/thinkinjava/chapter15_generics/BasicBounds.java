package thinkinjava.chapter15_generics;

import javax.tools.JavaCompiler;
import java.awt.*;
import java.net.SocketImpl;

/**
 * 泛型边界的demo
 *
 * @author trevor.zhao
 * @date 2020/10/13
 */
interface HasColor {
    java.awt.Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    public Colored(T item) {
        this.item = item;
    }
    //通过泛型边界可以使你获得调用泛型参数边界具有的方法的能力
    java.awt.Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}
//下面这句有问题   必须先class之后再interface
//!class ColoredDimension<T extends HasColor & Dimension> {

class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    public ColoredDimension(T item) {
        this.item = item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

}

interface Weight {
    int weight();
}

//和继承类似,你只能继承一个具体类,但是可以实现多个接口
class Solid<T extends Dimension & HasColor & Weight> {
    T item;

    public Solid(T item) {
        this.item = item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
     int weight() {
        return item.weight();
     }

}

class Bounded extends Dimension implements HasColor, Weight {

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }

}
