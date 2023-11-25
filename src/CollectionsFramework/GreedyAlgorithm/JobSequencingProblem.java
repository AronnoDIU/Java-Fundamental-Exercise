package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
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
        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

//    private static ArrayList<Integer> getIntegers(ArrayList<Job> jobs) {
//        ArrayList<Integer> sequence = new ArrayList<>();
//        int timeSlot = 0;
//
//        for (Job currentJob : jobs) {
//            // Find a free slot for this job (Note that we start from the last possible slot)
//            if (timeSlot < currentJob.deadline) {
//                sequence.add(currentJob.id);
//                timeSlot++;
//            }
//
//            // OR,
//
////            for (int j = Math.min(jobs.size() - 1, jobs.get(i).deadline - 1); j >= 0; j--) {
////                // Free slot found
////                if (!sequence.contains(j)) {
////                    sequence.add(j);
////                    timeSlot += jobs.get(i).profit;
////                    break;
////                }
////            }
//        }
//        return sequence;
//    }

    public static void main(String[] args) {
        int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        jobs.sort((obj1, obj2) -> obj2.profit - obj1.profit); // descending order of profit

        // To keep track of free time slots
        ArrayList<Integer> sequence = new ArrayList<>();
        int timeSlot = 0;

        for (Job currentJob : jobs) {
            // Find a free slot for this job (Note that we start from the last possible slot)
            if (timeSlot < currentJob.deadline) {
                sequence.add(currentJob.id);
                timeSlot++;
            }
        }

        // Print the sequence
        System.out.println("max jobs = " + sequence.size());
        for (int i = 0; i < sequence.size(); i++) {
            System.out.print("For Job " + sequence.get(i) + " -> Profit: " + jobs.get(sequence.get(i)).profit +
                    ", Deadline: " + jobs.get(sequence.get(i)).deadline);

            // Check if it's the last iteration to avoid a trailing comma
            if (i < sequence.size() - 1) {
                System.out.print(", ");
            }
        }

// Add a newline at the end for better readability
        System.out.println();


        // Print the sequence
//        System.out.println("max jobs = " + sequence.size());
//        for (int i = 0; i < sequence.size(); i++) {
//            System.out.print("For Job " + sequence.get(i) + " -> Deadline: " + jobs.get(sequence.get(i)).deadline +
//                    ", Profit: " + jobs.get(sequence.get(i)).profit);
//
//            // Check if it's the last iteration to avoid a trailing comma
//            if (i < sequence.size() - 1) {
//                System.out.print(", ");
//            }
//        }
//
//        // Add a newline at the end for better readability
//        System.out.println();

        // Sort all jobs according to decreasing order of profit

//        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
//        jobs.sort((a, b) -> a.profit - b.profit); // replace list.sort() with Collections.sort(list)
        // replace Comparator.comparingInt(a -> a.profit) with (a, b) -> a.profit - b.profit
//        jobs.sort(Comparator.comparingInt(a -> a.profit)); // ascending order of profit (default)
//        jobs.sort(Comparator.comparingInt(a -> a.profit).reversed()); // descending order of profit

        // Lambda expression for Comparing two objects of the same class by their profit in descending order
//        jobs.sort((a, b) -> b.profit - a.profit); // descending order of profit

        // Lambda expression for Comparing two objects of the same class by their profit in ascending order
//        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // ascending order of profit
//
//
//        // To keep track of free time slots
//
//        ArrayList<Integer> sequence = new ArrayList<>();
//        int timeSlot = 0;
//
//        for (int i = 0; i < jobs.size(); i++) {
//            // Find a free slot for this job (Note that we start from the last possible slot)
//            Job currentJob = jobs.get(i);
//            if (timeSlot < currentJob.deadline) {
//                sequence.add(currentJob.id);
//                timeSlot++;
//            }
//        }

//        for (Job currentJob: jobs) {
//            // Find a free slot for this job (Note that we start from the last possible slot)
//            if (timeSlot < currentJob.deadline) {
//                sequence.add(currentJob.id);
//                timeSlot++;
//            }
//        }

//        ArrayList<Integer> sequence = getIntegers(jobs);

        // Print the sequence
//        for (int jobIndex : sequence) {   // Shows Wrong Output
//            int i = jobs.indexOf(jobs.get(jobIndex));
//            System.out.print("For Job " + i + " = Deadline: " + jobs.get(jobIndex+1).deadline + ", " +
//                    "Profit: " + jobs.get(jobIndex+1).profit + ", ");
//        }


//        for (int i = 0; i < sequence.size(); i++) {   // Shows Wrong Output
//            int jobIndex = sequence.get(i);
//            System.out.print("For Job " + jobIndex + " = Deadline: " + jobs.get(jobIndex).deadline + ", " +
//                    "Profit: " + jobs.get(jobIndex).profit + ", ");
//        }


//        for (int i : sequence) {
////            System.out.print("For Job "+i + " = ");
//            System.out.print("For Job " + i + " = Deadline: " + jobs.get(i - 1).deadline + ", " +
//                    "Profit: " + jobs.get(i - 1).profit + ", ");
//        }

        // Print the sequence
//        System.out.println("max jobs = "+sequence.size());
//        for (int i = 0; i < sequence.size(); i++) {
//            System.out.print("For Job " + sequence.get(i) + " -> Deadline: " + jobs.get(sequence.get(i)).deadline +
//                    ", Profit: " + jobs.get(sequence.get(i)).profit);
//
//            // Check if it's the last iteration to avoid a trailing comma
//            if (i < sequence.size() - 1) {
//                System.out.print(", ");
//            }
//        }

// Add a newline at the end for better readability
//        System.out.println();




//        for (int i=0; i<sequence.size(); i++) {
//            System.out.print("For Job " + sequence.get(i) + " = Deadline: " + jobs.get(sequence.get(i)).deadline + ", " +
//                    "Profit: " + jobs.get(sequence.get(i)).profit + ", ");
//        }

//        sequence.forEach(i -> {
//            System.out.print("For Job " + i + " = Deadline: " + jobs.get(i - 1).deadline + ", " +
//                    "Profit: " + jobs.get(i - 1).profit + ", ");
//        });

//        System.out.println();

        // Print the Summation of maximum profit using Streams API
//        System.out.println("So, Maximum Profit: " + sequence.stream().mapToInt(i -> jobs.get(i - 1).profit).sum());


        // OR, This will generate wrong output

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