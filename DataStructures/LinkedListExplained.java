import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// LinkedList = stores Nodes in 2 parts (data + address)
// Nodes are in non-consecutive memory locations
// Elements are linked using pointers

//         Singly-Linked List
// Node        Node            Node
// [data | address] -> [data | address] -> [data | address]

//         Doubly-Linked List
// Node        Node             Node
// [address | data | address] <-> [address | data | address]

// advantages?
// 1. Dynamic Data Structure (allocates needed memory while running)
// 2. Insertion and Deletion of Nodes is easy. O(1)
// 3. 1. Implements Deque and List


// disadvantages?
// 1. Greater memory usage. Doubly linked list needs more memory than a singly linked list
// because each node in a doubly linked list contains two references:
// reference to the next and previous node
// 2. Searching elements is more time consuming. O(n)



public class LinkedListExplained {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>(); // Doubly-linked list
        Deque<String> stack = new LinkedList<>();
        Deque<String> queue = new LinkedList<>();


        list.add("a");
        list.add("b");
        list.add("c");

        list.remove("a");
        list.remove(1);
        System.out.println(list);

        //Stack
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.pop();
        System.out.println(stack);


        //Queue
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.poll();
        System.out.println(queue);



    }
}
