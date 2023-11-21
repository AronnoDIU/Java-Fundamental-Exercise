package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;

public class JobSequencingGreedy {
    // Each job has a unique-id,profit and deadline
    char id;
    int deadline, profit;

    // Constructors
    public JobSequencingGreedy() {
    }

    public JobSequencingGreedy(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    // Function to schedule the jobs takes 2 arguments
    // arraylist and no of jobs to schedule
    void printJobScheduling(ArrayList<JobSequencingGreedy> arr) {
        // Length of an array
        int n = arr.size();

        // Sort all jobs according to decreasing order of
        // profit
        arr.sort((a, b) -> b.profit - a.profit);

        // To keep track of free time slots
        boolean[] result = new boolean[3];

        // To store result (Sequence of jobs)
        char[] job = new char[3];

        // Iterate through all given jobs
        for (int i = 0; i < n; i++) {
            // Find a free slot for this job (Note that we
            // start from the last possible slot)
            for (int j
                 = Math.min(3 - 1, arr.get(i).deadline - 1);
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
        ArrayList<JobSequencingGreedy> arr = new ArrayList<>();
        arr.add(new JobSequencingGreedy('a', 2, 100));
        arr.add(new JobSequencingGreedy('b', 1, 19));
        arr.add(new JobSequencingGreedy('c', 2, 27));
        arr.add(new JobSequencingGreedy('d', 1, 25));
        arr.add(new JobSequencingGreedy('e', 3, 15));

        System.out.println(
                "The Following is maximum profit sequence of jobs");

        JobSequencingGreedy job = new JobSequencingGreedy();

        // Function call
        job.printJobScheduling(arr);
    }
}

/*Expected Output:

The Following is the maximum profit sequence of jobs
c a e


 */