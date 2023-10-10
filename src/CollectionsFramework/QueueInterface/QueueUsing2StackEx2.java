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
//        Queue2Stack queue = new Queue2Stack();
        Queue2Stack.add(1);
        Queue2Stack.add(2);
        Queue2Stack.add(3);
        Queue2Stack.add(4);
        Queue2Stack.add(5);


        while (!Queue2Stack.isEmpty()) {
            System.out.println(Queue2Stack.peek());
            Queue2Stack.remove();
        }
    }
}

/*Expected Output:

1
2
3
4
5

* */