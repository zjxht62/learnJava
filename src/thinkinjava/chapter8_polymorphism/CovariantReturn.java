package thinkinjava.chapter8_polymorphism;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/16
 */
class Grain {
    @Override
    public String toString() {
        return "Grain{}";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat{}";
    }
}
class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    //在子类的被覆盖的方法可以返回基类方法的返回类型的某种导出类型
    Wheat process() {
        return new Wheat();
    }
}
public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain grain = mill.process();
        System.out.println(grain);
        mill = new WheatMill();
        grain = mill.process();
        System.out.println(grain);

    }
}
