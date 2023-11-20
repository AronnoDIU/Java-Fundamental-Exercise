package CollectionsFramework.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class ActivityCompareGreedy {
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