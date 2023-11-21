package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingGreedy {
    // Each job has a unique-id,profit and deadline
    char id;
    int deadline, profit;

    // Constructors
    public JobSequencingGreedy() {}

    public JobSequencingGreedy(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    // Function to schedule the jobs takes 2 arguments
    // arraylist and no of jobs to schedule
    void printJobScheduling(ArrayList<JobSequencingGreedy> arr, int t) {
        // Length of an array
        int n = arr.size();

        // Sort all jobs according to decreasing order of
        // profit
        arr.sort((a, b) -> b.profit - a.profit);

        // To keep track of free time slots
        boolean[] result = new boolean[t];

        // To store result (Sequence of jobs)
        char[] job = new char[t];

        // Iterate through all given jobs
        for (int i = 0; i < n; i++) {
            // Find a free slot for this job (Note that we
            // start from the last possible slot)
            for (int j
                 = Math.min(t - 1, arr.get(i).deadline - 1);
                 j >= 0; j--) {
                // Free slot found
                if (!result[j]) {
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }

        // Print the sequence
        for (char jb : job)
            System.out.print(jb + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] profit = {20, 15, 10, 5, 1};
        int[] deadline = {2, 2, 1, 3, 3};
        int n = profit.length;


    }
}
