package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueCFex1 {
    public static void main(String[] args) {
        //Queue<Integer> integerArrayDeque = new LinkedList();
        Queue<Integer> integerArrayDeque = new ArrayDeque<>();
        integerArrayDeque.add(1);
        integerArrayDeque.add(2);
        integerArrayDeque.add(3);
        integerArrayDeque.add(4);
        integerArrayDeque.add(5);

        while (!integerArrayDeque.isEmpty()) {
            System.out.println(integerArrayDeque.peek());
            integerArrayDeque.remove();
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