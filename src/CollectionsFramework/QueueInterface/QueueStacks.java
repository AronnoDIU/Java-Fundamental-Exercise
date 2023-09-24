package CollectionsFramework.QueueInterface;

import java.util.Stack;

// Queue using two stacks
public class QueueStacks {
    static class Queue {
        static Stack<Integer> integerStack1 = new Stack<>();
        static Stack<Integer> integerStack2 = new Stack<>();

        public static boolean isEmpty() {
            return integerStack1.isEmpty();
        }

        public static void add(int data) {
            while (!integerStack1.isEmpty()) {
                integerStack2.push(integerStack1.pop());
            }
            integerStack1.push(data);
            while (!integerStack2.isEmpty()) {
                integerStack1.push(integerStack2.pop());
            }
        }

        public static int remove() {
            return integerStack1.pop();
        }

        public static int peek() {
            return integerStack1.peek();
        }
    }
    public static void main(String[] args) {
//        Queue q = new Queue();
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}

/*Expected Output:

1
2
3

* */