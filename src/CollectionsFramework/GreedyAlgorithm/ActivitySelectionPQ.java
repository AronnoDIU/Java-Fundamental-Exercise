package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

// Activity Selection using Priority-Queue
public class ActivitySelectionPQ {
    // Pair class
    static class Pair {

        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static void SelectActivities(int[] s, int[] f) {

        // Vector to store results.
        ArrayList<Pair> ans = new ArrayList<>();

        // Minimum Priority Queue to sort activities in
        // ascending order of finishing time (f[i]).
        PriorityQueue<Pair> p = new PriorityQueue<>(
                Comparator.comparingInt(p2 -> p2.first));

        for (int i = 0; i < s.length; i++) {
            // Pushing elements in the priority queue where the
            // key is f[i]
            p.add(new Pair(f[i], s[i]));
        }

        Pair it = p.poll();
        assert it != null;
        int start = it.second;
        int end = it.first;
        ans.add(new Pair(start, end));

        while (!p.isEmpty()) {
            Pair itr = p.poll();
            if (itr.second >= end) {
                start = itr.second;
                end = itr.first;
                ans.add(new Pair(start, end));
            }
        }
        System.out.println(
                "The Following Activities should be selected. \n");

        for (Pair itr : ans) {
            System.out.println(
                    "Activity started at " + itr.first
                            + " and ends at " + itr.second);
        }
    }

    public static void main(String[] args) {
        int[] s = {1, 3, 0, 5, 8, 5};
        int[] f = {2, 4, 6, 7, 9, 9};

        // Function call
        SelectActivities(s, f);
    }
}

/*Expected Output:

The Following Activities should be selected.

Activity started at 1 and ends at 2
Activity started at 3 and ends at 4
Activity started at 5 and ends at 7
Activity started at 8 and ends at 9

 */