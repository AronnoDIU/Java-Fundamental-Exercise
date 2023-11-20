package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class ActivityCompareGreedy {

    // Returns count of the maximum set of activities that
    // can
    // be done by a single person, one at a time.
    static void printMaxActivities(Activity[] arr, int n) {
        // Sort jobs according to finish time
//        Compare obj = new Compare();
        Compare.compare(arr, n);
        System.out.println(
                "Following activities are selected :");

        // The first activity always gets selected
        int i = 0;
        System.out.print("(" + arr[i].start + ", "
                + arr[i].finish + ")");

        // Consider the rest of the activities
        for (int j = 1; j < n; j++) {

            // If this activity has start time greater than
            // or equal to the finish time of previously
            // selected activity, then select it
            if (arr[j].start >= arr[i].finish) {
                System.out.print(", (" + arr[j].start + ", "
                        + arr[j].finish + ")");
                i = j;
            }
        }
    }
    public static void main(String[] args) {
        int[] s = {1, 3, 0, 5, 8, 5};
        int[] f = {2, 4, 6, 7, 9, 9};
        int n = s.length;
    }
}

// A job has a start time, finish time and profit.
class Activity {
    int start, finish;

    // Constructor
    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

// class to define user defined comparator
class Compare {

    // A utility function that is used for sorting
    // activities according to finish time
    static void compare(Activity[] array, int n) {
        Arrays.sort(array, new Comparator<Activity>() {
            @Override
            public int compare(Activity s1, Activity s2) {
                return s1.finish - s2.finish;
            }
        });
    }
}

/*Expected Output:

The Following activities are selected
0 1 3 4

 */