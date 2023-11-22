package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;

/* You are given N activities with their start and finish times. Select the maximum number
of activities that can be performed by a single person, assuming that a person can only
work on a single activity at a time. Activities are sorted according to their finishing time.

Print the selected activities.
Note: The start time of an activity can't be equal to the finish time of another activity
(i.e., start time should always be smaller than finish time). Also, there should not be
any overlap between two activities (i.e., start time of one activity should always be
lesser than or equal to the finish time of the other activity).

For example, if the given set of activities is
{ {1, 2}, {3, 4}, {0, 6}, {5, 7}, {8, 9}, {5, 9} },
then the output should be {0, 6}, {5, 7}, {8, 9}
which are the selected activities from the given list of activities in the
decreasing order of finish time and increasing order of start time respectively.

    1. Sort the activities according to their finishing time.
    2. Select the first activity from the sorted array and select it.
    3. Do the following for the remaining activities in the sorted array.
        a. If the start time of this activity is greater than or equal to the finish time
        of the previously selected activity, then select this activity and print it.

        Non-overlapping Intervals(Disjoint Intervals)
        Start time >= Finish time of previously selected activity.

        Then, Activity counts ++;

 */
public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // End time basis sorted array
        int maxActivities = 0; // initialize maxActivities = 0
        ArrayList<Integer> selectedActivities = new ArrayList<>();

        // 1st activity
        maxActivities = 1; // The First activity is always selected

        // Remaining activity
        selectedActivities.add(0);
        int lastEnd = end[0];

        for (int index = 1; index < end.length; index++) {
            /* If the start time of this activity is greater
             than or equal to the finish time of the previously selected activity,
             then select this activity and print it.
             Non-overlapping Intervals(Disjoint Intervals)
             Start time >= Finish time of previously selected activity.
             Then, Activity counts ++;*/

            if (start[index] >= lastEnd) {
                // Select this activity
                maxActivities++;
                selectedActivities.add(index);
                lastEnd = end[index];
            }
        }

        System.out.println("Maximum number of activities that can be performed by a single person = " + maxActivities);
        System.out.println("Selected Activities: " + selectedActivities);
    }
}

/*
Expected Output:

Maximum number of activities that can be performed by a single person = 4
Selected Activities: [0, 1, 3, 4]

*/