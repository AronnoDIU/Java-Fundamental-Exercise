package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given a positive number n, efficiently generate binary numbers
 * between 1 and n using the queue data structure in linear time.
 * <p>
 * For example, for n = 16, the binary numbers are:
 * 1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 10000
 */

// Generate binary numbers between 1 to `n` using a queue
public class GenerateBinaryNumbers {
    public static void generate(int n) {
        // create an empty queue and enqueue 1
        Queue<String> stringArrayDeque = new ArrayDeque<>();
        stringArrayDeque.add("1");

        // run `n` times
        int i = 1;
        while (i++ <= n) {
            // append 0 and 1 to the front element of the queue and
            // enqueue both strings
            stringArrayDeque.add(stringArrayDeque.peek() + '0');
            stringArrayDeque.add(stringArrayDeque.peek() + '1');

            // remove the front element and print it
            System.out.print(stringArrayDeque.poll() + ' ');
        }
    }

    public static void main(String[] args) {
        int number = 16;
        generate(number);
    }
}

/*Expected Output:

1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 10000

* */