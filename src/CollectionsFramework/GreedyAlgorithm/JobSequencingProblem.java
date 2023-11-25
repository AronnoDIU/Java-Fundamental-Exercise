package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;

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
    static class Job {
        int id;
        int deadline;
        int profit;

        // Constructor
        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    private static ArrayList<Integer> getIntegers(ArrayList<Job> jobs) {
        ArrayList<Integer> sequence = new ArrayList<>();
        int timeSlot = 0;

        for (Job currentJob : jobs) {
            // Find a free slot for this job (Note that we start from the last possible slot)
            if (timeSlot < currentJob.deadline) {
                sequence.add(currentJob.id);
                timeSlot++;
            }

            // OR,

//            for (int j = Math.min(jobs.size() - 1, jobs.get(i).deadline - 1); j >= 0; j--) {
//                // Free slot found
//                if (!sequence.contains(j)) {
//                    sequence.add(j);
//                    timeSlot += jobs.get(i).profit;
//                    break;
//                }
//            }
        }
        return sequence;
    }

    public static void main(String[] args) {
        int[][] jobsInfo = {{1, 2, 100}, {2, 1, 19}, {3, 2, 27}, {4, 1, 25}, {5, 1, 15}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int[] jobInfo : jobsInfo) {
            jobs.add(new Job((char) jobInfo[0], jobInfo[1], jobInfo[2]));
        }

        // Sort all jobs according to decreasing order of profit

//        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
//        jobs.sort((a, b) -> a.profit - b.profit); // replace list.sort() with Collections.sort(list)
        // replace Comparator.comparingInt(a -> a.profit) with (a, b) -> a.profit - b.profit
//        jobs.sort(Comparator.comparingInt(a -> a.profit)); // ascending order of profit (default)
//        jobs.sort(Comparator.comparingInt(a -> a.profit).reversed()); // descending order of profit

        // Lambda expression for Comparing two objects of the same class by their profit in descending order
        jobs.sort((a, b) -> b.profit - a.profit); // descending order of profit


        // To keep track of free time slots
        ArrayList<Integer> sequence = getIntegers(jobs);

        // Print the sequence
        for (int i : sequence) {
            System.out.print(i + " ");
        }

        System.out.println(" Maximum Profit: " + sequence.stream().mapToInt(Integer::intValue).sum());


        // OR,

        /*int[] deadline = {2, 1, 2, 1, 3};
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

        System.out.println(" Maximum Profit: " + maxProfit);*/
    }
}

/* Expected Output:

   Maximum Profit: 140

*/