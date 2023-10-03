package CollectionsFramework.QueueInterface;

import java.util.Stack;

// Queue using two Stack
public class QueueUsing2StackEx2 {
    static class Queue2Stack {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();


        public static boolean isEmpty() {
            return stack1.isEmpty();
        }


        public static void add(int data) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(data);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }


        public static int remove() {
            return stack1.pop();
        }


        public static int peek() {
            return stack1.peek();
        }
    }

    public static void main(String[] args) {
        Queue2Stack queue = new Queue2Stack();
        queue.add(1);
        queue.add(2);
        queue.add(3);


        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}

/*Expected Output:

1
2
3

* */