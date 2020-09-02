package thinkinjava.chapter11_holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/17
 */
public class QueueDemo {
    public static void printQ(Queue queue) {
        //peek()和element()在不移除的情况下返回队头 前者在队列为空的时候返回null 后者抛出NoSuchElementException
        //poll()和remove()移除并返回队头 前者在队列为空的时候返回null 后者抛出NoSuchElementException
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            //插入到队尾
            queue.offer(rand.nextInt(i + 10));
        }
        printQ(queue);


    }
}
