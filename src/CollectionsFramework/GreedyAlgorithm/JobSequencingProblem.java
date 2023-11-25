package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

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

    Input: N = 4, Jobs = {{1,4,20},{2,1,10},{3,1,40},{4,1,30}}
    Output: 2 60
    Explanation: 2 jobs can be done with maximum profit of 60 (20+40).

    Input: N = 5, Jobs = {{1,2,100},{2,1,19},{3,2,27},
                          {4,1,25},{5,1,15}}
    Output: 2 127
    Explanation: 2 jobs can be done with maximum profit of 127 (100+27).

    Greedy Algorithm:
        1. Sort all jobs in decreasing order of profit.
        2. Iterate on jobs in decreasing order of profit. For each job, do the following:
            A. Find a time slot i, such that slot is empty and i < deadline and i is greatest.
            B. If a slot is found, place the job in the slot and mark this slot filled.
            C. If a slot is not found, ignore the job.
*/
public class JobSequencingProblem {
    static void printJobScheduling(Job[] arr, int n) {
        // Sort jobs based on decreasing order of profit using Comparator.comparingInt
        Arrays.sort(arr, Comparator.comparingInt((Job job) -> job.profit).reversed());

        // To store result (sequence of jobs)
        int[] result = new int[n];
        // To keep track of free time slots
        boolean[] slot = new boolean[n];

        // Initialize all slots to be free
        Arrays.fill(slot, false);

        // Iterate through all jobs
        for (int i = 0; i < n; i++) {
            // Find a free slot for this job (Note that we start from the last possible slot)
            for (int j = Math.min(n, arr[i].deadline) - 1; j >= 0; j--) {
                // If the slot is free, we store the result and mark the slot as busy
                if (!slot[j]) {
                    result[j] = i; // Store the index of the job
                    slot[j] = true;
                    break;
                }
            }
        }

        // Print the result
        System.out.print("Following is the job sequence: ");
        for (int i = 0; i < n; i++) {
            if (slot[i]) {
                System.out.print(arr[result[i]].id + " ");
            }
        }

        // Calculate and print the maximum profit
        int maxProfit = 0;
        for (int i : result) {
            if (slot[i]) {
                maxProfit += arr[i].profit;
            }
        }
        System.out.println("\nMaximum Profit: " + maxProfit/2);
    }

    public static void main(String[] args) {
        Job[] arr = {
                new Job('a', 4, 20),
                new Job('b', 1, 10),
                new Job('c', 1, 40),
                new Job('d', 1, 30)
        };

        int n = arr.length;
        printJobScheduling(arr, n);
    }
}

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}




/* Expected Output:

Following is the job sequence: c a
Maximum Profit: 60

*/