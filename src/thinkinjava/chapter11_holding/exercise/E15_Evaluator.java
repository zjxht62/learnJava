package thinkinjava.chapter11_holding.exercise;

import net.mindview.util.Stack;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/14
 */
public class E15_Evaluator {
    private final static Stack<Character> stack = new Stack<>();
    private static void evaluate(String expr) {
        char[] data = expr.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '+') {
                stack.push(data[i+1]);
            } else if (data[i] == '-') {
                System.out.print(stack.pop());
            }
        }
    }

    public static void main(String[] args) {
        evaluate("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}
