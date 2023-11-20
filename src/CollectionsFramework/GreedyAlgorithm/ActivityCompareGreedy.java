package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class ActivityCompareGreedy {

    // Returns count of the maximum set of activities that can
    // be done by a single person, one at a time.
    static void printMaxActivities(Activity[] array, int n) {
        // Sort jobs according to finish time
        Compare.compare(array);
        System.out.println("The Following activities are selected :");

        // The first activity always gets selected
        int i = 0;
        System.out.print("(" + array[i].start + ", " + array[i].finish + ")");

        // Consider the rest of the activities
        for (int j = 1; j < n; j++) {

            // If this activity has start time greater than or equal to the finish
            // time of previously selected activity, then select it
            if (array[j].start >= array[i].finish) {
                System.out.print(", (" + array[j].start + ", "
                        + array[j].finish + ")");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        Activity[] array = new Activity[n];
        array[0] = new Activity(5, 9);
        array[1] = new Activity(1, 2);
        array[2] = new Activity(3, 4);
        array[3] = new Activity(0, 6);
        array[4] = new Activity(5, 7);
        array[5] = new Activity(8, 9);

        // Function call
        printMaxActivities(array, n);
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
    static void compare(Activity[] array) {
        Arrays.sort(array, Comparator.comparingInt(s -> s.finish));
    }
}

/*Expected Output:

The Following activities are selected :
(1, 2), (3, 4), (5, 7), (8, 9)

 */