import java.util.Stack;

public class LIFO {
    public static void main(String[] args) {

        // stack - LIFO data structure. Last In First Out.
        // Stores object in a "tower"
        // push() to add to the top
        // pop() to remove from the top
        Stack<Integer> stack = new Stack<>();

        // Push elements on top of the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Show the top element
        System.out.println("Top element is " + stack.peek());

        // Pop elements from the stack(removes the top element)
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.search(10)); // returns 3
        System.out.println(stack.search(15)); // returns -1
    }
}
