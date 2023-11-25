package CollectionsFramework.GreedyAlgorithm;

/*
  Job Sequencing Problem:
    Given an array of jobs where every job has a deadline and associated profit if the job
    is finished before the deadline. It is also given that every job takes a single unit of
    time, so the minimum possible deadline for any job is 1. How to maximize the total profit
    if only one job can be scheduled at a time.

    Job Array:
          JobID   Deadline    Profit
            a       2           100
            b       1           19
            c       2           27
            d       1           25
            e       3           15

    Greedy Algorithm:
        1. Sort all jobs in decreasing order of profit.
        2. Iterate on jobs in decreasing order of profit. For each job, do the following:
            A. Find a time slot i, such that slot is empty and i < deadline and i is greatest.
            B. If a slot is found, place the job in the slot and mark this slot filled.
            C. If a slot is not found, ignore the job.

    Examples:
        Input: N = 4, Jobs = {{1,4,20},{2,1,10},{3,1,40},{4,1,30}}
        Output: 2 60
        Explanation: 2 jobs can be done with maximum profit of 60 (20+40).

        Input: N = 5, Jobs = {{1,2,100},{2,1,19},{3,2,27},
                              {4,1,25},{5,1,15}}
        Output: 2 127
        Explanation: 2 jobs can be done with maximum profit of 127 (100+27).
*/
public class JobSequencingProblem {
    public static void main(String[] args) {
        int[] deadline = {2, 1, 2, 1, 3};
        int[] profit = {100, 19, 27, 25, 15};

        int maxDeadline = 0;

        for (int k : deadline) {
            if (k > maxDeadline) {
                maxDeadline = k;
            }
        }

        int[] job = new int[maxDeadline];

        for (int i = 0; i < deadline.length; i++) {
            if (job[deadline[i] - 1] < profit[i]) {
                job[deadline[i] - 1] = profit[i];
            }
        }

        int maxProfit = 0;

        for (int j : job) {
            maxProfit += j;
        }

        System.out.println(" Maximum Profit: " + maxProfit);
    }
}

/* Expected Output:

   Maximum Profit: 140

*/