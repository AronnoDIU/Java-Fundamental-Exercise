package CollectionsFramework.ListInterface.VectorStack;

import java.util.ArrayList;

// stack using Array List
public class StackScratchArrayList {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}

/*Expected Output:

4
3
2
1

* */