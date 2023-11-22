package CollectionsFramework.GreedyAlgorithm;

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

 */
public class ActivitySelection {
    public static void main(String[] args) {
        int[] s = {1, 3, 0, 5, 8, 5};
        int[] f = {2, 4, 6, 7, 9, 9};
        int n = s.length;

        // Function call
//        printMaxActivities(s, f, n);
    }
}
