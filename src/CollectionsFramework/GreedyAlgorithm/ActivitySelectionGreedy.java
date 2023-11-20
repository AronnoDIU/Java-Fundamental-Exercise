package CollectionsFramework.GreedyAlgorithm;

public class ActivitySelectionGreedy {
    // Prints a maximum set of activities that can be done
    // by a single person, one at a time.
    public static void printMaxActivities(int[] s, int[] f, int n) {
        int i, j;

        System.out.println("The Following activities are selected");

        // The first activity always gets selected
        i = 0;
        System.out.print(i + " ");

        // Consider the rest of the activities
        for (j = 1; j < n; j++) {
            // If this activity has start time greater than or equal to the finish time of
            // previously selected activity, then select it
            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        int[] s = {1, 3, 0, 5, 8, 5};
        int[] f = {2, 4, 6, 7, 9, 9};
        int n = s.length;

        // Function call
        printMaxActivities(s, f, n);
    }
}

/*Expected Output:

The Following activities are selected
0 1 3 4

 */