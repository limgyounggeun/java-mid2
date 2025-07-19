package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();

        //데이터 추가
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        System.out.println(deque);
        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);
    }
}
