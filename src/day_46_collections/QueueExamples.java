package day_46_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(10);
        queue.add(8);
        queue.add(2);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("---------------------------");

        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("java"); // offer just adds to the queue -> could use add()
        queue2.offer("tuesday");
        queue2.offer("soft skills");
        queue2.offer("automation");

        System.out.println(queue2);
        System.out.println(queue2.peek()); // the other method to use is element()

        System.out.println(queue2.poll()); // the other method to use is remove()
        System.out.println(queue2);

        System.out.println(queue2.peek());

        System.out.println(queue2);

        queue2.offerFirst("API"); // method from Deque
        System.out.println(queue2);

//        queue2.add(null); null is not allowed in queue types
        queue2.pollLast();
        System.out.println(queue2);

//        new ArrayDeque<>().remove(); // causes exception
//        new ArrayDeque<>().poll(); // returns null, but no exception

    }
}
