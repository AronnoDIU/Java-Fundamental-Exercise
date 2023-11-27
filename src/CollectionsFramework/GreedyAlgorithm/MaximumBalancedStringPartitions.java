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
    public static void main(String[] args) {
        String s = "ababbbabbababa";
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
            else count--;

            if (count == 0) max++;
        }

        System.out.println(" Maximum Balanced String Partitions: " + max);
    }
}
