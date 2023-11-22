package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;

/*
 A job has a start time, finish time and profit.

    2D Array: Workings of the Greedy Algorithm
    1. Sort the jobs according to their finishing time.

    2D Array:           0    1    2
                 A0   |----|----|----|
                 A1   |----|----|----|
                 A2   |----|----|----|
                 A3   |----|----|----|
                 A4   |----|----|----|
                 A5   |----|----|----|

        Here, A0, A1, A2, A3, A4, A5 Store the activities.
              => 0 will Store the Index.
              =>1, 2 Store the time slots.{ 1 for start & 2 for finish}


*/
public class ActivitySelectionUnsorted {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // End time basis sorted array
        int[][] maxActivities = new int[start.length][3]; // initialize maxActivities = 0

        for (int index = 0; index < start.length; index++) {
            maxActivities[index][0] = index;
            maxActivities[index][1] = start[index];
            maxActivities[index][2] = end[index];
        }
        // Lambda Expression/Function for sorting the 2D Array
        Arrays.sort(maxActivities, (a, b) -> Integer.compare(a[2], b[2]));
    }
}
