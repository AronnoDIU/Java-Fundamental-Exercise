package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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
        int[][] Activities = new int[start.length][3]; // initialize Activities = 0

        for (int index = 0; index < start.length; index++) {
            Activities[index][0] = index;
            Activities[index][1] = start[index];
            Activities[index][2] = end[index];
        }
        // Lambda Expression/Function for sorting the 2D Array
        Arrays.sort(Activities, Comparator.comparingInt(a -> a[2]));

        // End time basis sorted array
        int maxActivities = 0; // initialize Activities = 0
        ArrayList<Integer> selectedActivities = new ArrayList<>();

        // 1st activity
        maxActivities = 1; // The First activity is always selected

        // Remaining activity
        selectedActivities.add(Activities[0][0]);
        int lastEnd = Activities[0][2];

        // Time complexity: O(n)
        for (int index = 1; index < end.length; index++) {
            /* If the start time of this activity is greater
             than or equal to the finish time of the previously selected activity,
             then select this activity and print it.
             Non-overlapping Intervals(Disjoint Intervals)
             Start time >= Finish time of previously selected activity.
             Then, Activity counts ++;*/

            if (Activities[index][1] >= lastEnd) {

                // Select this activity
                maxActivities++;

                // Add index to selectedActivities list
                selectedActivities.add(Activities[index][0]);
                lastEnd = Activities[index][2];
            }
        }

        System.out.println("Maximum number of activities that can " +
                "be performed by a single person = " + maxActivities);

        System.out.println("Selected Activities: A" + selectedActivities);
    }
}

/*
Expected Output:

Maximum number of activities that can be performed by a single person = 4
Selected Activities: A[0, 1, 3, 4]

*/