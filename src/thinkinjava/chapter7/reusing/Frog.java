package thinkinjava.chapter7.reusing;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/7/13
 */
public class Frog extends Amphlibian{

    @Override
    void makeSound() {
        System.out.println("呱呱叫");
    }

    public static void main(String[] args) {
        Amphlibian amphlibian = new Frog();
        amphlibian.makeSound();
    }
}
