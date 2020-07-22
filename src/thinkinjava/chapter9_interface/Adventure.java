package thinkinjava.chapter9_interface;

import javax.swing.*;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/21
 */
interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
        System.out.println("ActionCharacter.fight()");
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {
    @Override
    public void swim() {

    }

    //由于父类和实现的接口都有fight这个方法，所以hero既可以当做ActionCharacter来调用fight也可以通过CanFight接口来调用fight
    @Override
    public void fight() {
        super.fight();
    }

    @Override
    public void fly() {

    }
}

public class Adventure {
    public static void t(CanFight x) {x.fight();}
    public static void u(CanSwim x) {x.swim();}
    public static void v(CanFly x) {x.fly();}
    public static void w(ActionCharacter x) {x.fight();}

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
    }
}
