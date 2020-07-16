package thinkinjava.chapter8_polymorphism;

import static net.mindview.util.Print.print;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/16
 */
class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    @Override
    public void act() {
        print("Happy Actor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        print("Sad Actor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        this.actor = new SadActor();
    }
    public void performPlay() {
        actor.act();
    }
}
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
