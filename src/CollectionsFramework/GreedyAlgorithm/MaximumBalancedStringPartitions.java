package CollectionsFramework.GreedyAlgorithm;

/*
 We have a balanced string of size N with an equal number of 'L' and 'R'; the task
 is to find the maximum number of balanced strings numbers X. Such that a given
 String can be portioned into X balanced substring. A String is called to be
 balanced if it has an equal number of 'L' and 'R'.

    Example:
        Input: s = "RLRRLLRLRL"
        Output: 4
        Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring
         contains the same number of 'L' and 'R'.

        Input: s = "RLLLLRRRLR"
        Output: 3
        Explanation: s can be split into "RL", "LLLRRR", "LR", each substring
         contains the same number of 'L' and 'R'.

        Input: s = "LLLLRRRR"
        Output: 1
        Explanation: s can be split into "LLLLRRRR".

        Input: s = "RLRRRLLRLL"
        Output: 2
        Explanation: s can be split into "RL", "RRRLLRLL", since each substring
        contains an equal number of 'L' and 'R'.

 */
public class MaximumBalancedStringPartitions {
    static int maxBalancedStringPartitions(String string) {
        if (string == null || string.isEmpty()) return 0;

        int maxAns = 0; // Maximum Balanced String Partitions
        int R = 0; // Count of 'R'
        int L = 0; // Count of 'L'

        for (int i = 0; i < string.length(); i++) {
            // If the current character is 'R', then increment R
            if (string.charAt(i) == 'R') {
                R++;
            } else if (string.charAt(i) == 'L') {
                L++;
            }

            // If the count of 'R' and 'L' is equal, then increment maxAns
            if (R == L) {
                maxAns++;
            }
        }

        return maxAns;
    }

    public static void main(String[] args) {
        String string = "LLRRRLLRRL";

        System.out.println("Maximum Balanced String Partitions: " + maxBalancedStringPartitions(string));
    }
}

/*
Expected Output:

Maximum Balanced String Partitions: 4

 */