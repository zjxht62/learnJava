package thinkinjava.chapter17_containers;

import thinkinjava.chapter13_strings.WhitherStirngBuilder;

import java.util.LinkedList;
import java.util.Stack;

/**
 * java 栈
 *
 * @author trevor.zhao
 * @date 2020/10/28
 */
enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER
}
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (Month m : Month.values()) {
            stack.push(m.toString());
        }
        System.out.println("stack = " + stack);
        //像Vector一样处理stack
        stack.addElement("The last line");
        System.out.println("element 5 = " + stack.elementAt(5));
        System.out.println("popping elements:");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

        //使用linkedlist作为stack
        LinkedList<String> lstack = new LinkedList<>();
        for (Month m : Month.values()) {
            lstack.addFirst(m.toString());
        }
        System.out.println();
        System.out.println("lstack = " + lstack);
        while (!lstack.isEmpty()) {
            System.out.print(lstack.removeFirst() + " ");
        }
    }

}
