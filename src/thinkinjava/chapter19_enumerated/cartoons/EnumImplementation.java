package thinkinjava.chapter19_enumerated.cartoons;

import net.mindview.util.Generator;

import java.util.Random;

/**
 * 枚举类可以实现接口 但是无法继承其他类
 *
 * @author trevor.zhao
 * @date 2020/11/3
 */
enum CartoonCharacter implements Generator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    private Random rand = new Random(47);


    @Override
    public CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}
public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg) {
        System.out.print(rg.next() + ", ");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++) {
            printNext(cc);
        }
    }
}
