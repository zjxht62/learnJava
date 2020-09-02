package thinkinjava.chapter11_holding;

import java.util.Stack;

/**
 * 测试栈
 *
 * @author trevor.zhao
 * @date 2020/8/13
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
