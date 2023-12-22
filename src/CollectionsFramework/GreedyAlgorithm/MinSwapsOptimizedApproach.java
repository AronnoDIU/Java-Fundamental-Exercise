package CollectionsFramework.GreedyAlgorithm;

// Java program to count swaps required to balance string

import java.util.*;

public class MinSwapsOptimizedApproach {
    // Function to calculate swaps required to balance string
    public static long swapCount(String s) {

        // Keep track of '['
        Vector<Integer> pos = new Vector<>();
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) == '[')
                pos.add(i);

        // To count the number of encountered '['
        int count = 0;

        // To track the position of next '[' in pos
        int p = 0;

        // To store result
        long sum = 0;

        char[] S = s.toCharArray();

        for (int i = 0; i < s.length(); ++i) {

            // Increment count and move p to next position
            if (S[i] == '[') {
                ++count;
                ++p;
            } else if (S[i] == ']')
                --count;

            // We have encountered an unbalanced part of string
            if (count < 0) {

                // Increment sum by number of swaps required i.e., position
                // of next '[' - current position
                sum += pos.get(p) - i;
                char temp = S[i];
                S[i] = S[pos.get(p)];
                S[pos.get(p)] = temp;
                ++p;
                // Reset count to 1
                count = 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String string = "[]][][";
        System.out.println(swapCount(string));

        string = "[[][]]";
        System.out.println(swapCount(string));
    }
}

/*
Expected Output:

2
0

*/