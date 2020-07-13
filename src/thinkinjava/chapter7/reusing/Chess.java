package thinkinjava.chapter7.reusing;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/12
 */
public class Chess extends BoardGame {
    Chess() {
        super(20);
        System.out.println("Chess consturctor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
class Game {
    Game(int i) {
        System.out.println("Game constructor" + i);
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor" + i);
    }
}

