import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        // Deque as a Stack (LIFO - Last In First Out)
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the top of the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Show the top element
        System.out.println("Stack - Top element is " + stack.peek());

        // Pop elements from the stack (removes the top element)
        while (!stack.isEmpty()) {
            System.out.println("Stack - Popped: " + stack.pop());
        }

        // stack.search(); It does not have built-in method for position searching

        // Deque as a Queue (FIFO - First In First Out)
        Deque<Integer> queue = new ArrayDeque<>();

        // Add elements to the end of the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Show the front element
        System.out.println("Queue - Front element is " + queue.peek());

        // Remove elements from the queue (removes the front element)
        while (!queue.isEmpty()) {
            System.out.println("Queue - Removed: " + queue.poll());
        }


        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue contains 10: " + queue.contains(10)); // returns true
        System.out.println("Queue contains 15: " + queue.contains(15)); // returns false
    }
}
