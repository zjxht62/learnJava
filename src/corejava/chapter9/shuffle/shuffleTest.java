package corejava.chapter9.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/10/8
 */
public class shuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 49; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
