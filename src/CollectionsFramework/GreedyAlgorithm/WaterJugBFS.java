package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WaterJugBFS {
    static class Pair {
        int jug1, jug2;
        List<Pair> path;

        Pair(int jug1, int jug2) {
            this.jug1 = jug1;
            this.jug2 = jug2;
            path = new ArrayList<>();
        }

        Pair(int jug1, int jug2, List<Pair> _path) {
            this.jug1 = jug1;
            this.jug2 = jug2;

            path = new ArrayList<>();
            path.addAll(_path);
            path.add(new Pair(this.jug1, this.jug2));
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        int jug1 = 4;
        int jug2 = 3;
        int target = 2;

        getPathIfPossible(jug1, jug2, target);
    }

    private static void
    getPathIfPossible(int jug1, int jug2, int target) {
        boolean[][] visited = new boolean[jug1 + 1][jug2 + 1];
        Queue<Pair> queue = new LinkedList<>();

        // Initial State: Both Jugs are empty so,
        // initialise j1 j2 as 0 and put it in the path list
        Pair initialState = new Pair(0, 0);
        initialState.path.add(new Pair(0, 0));
        queue.offer(initialState);

        while (!queue.isEmpty()) {
            Pair currentPair = queue.poll();

            // Skip already visited states and overflowing water states
            if (currentPair.jug1 > jug1 || currentPair.jug2 > jug2
                    || visited[currentPair.jug1][currentPair.jug2])
                continue;
            // mark current jugs state as visited
            visited[currentPair.jug1][currentPair.jug2] = true;

            // Check if the current state has already reached
            // the target amount of water or not
            if (currentPair.jug1 == target || currentPair.jug2 == target) {
                if (currentPair.jug1 == target) {
                    // If in our current state, jug1 holds the required amount of water,
                    // then we empty the jug2 and push it into our path.
                    currentPair.path.add(new Pair(currentPair.jug1, 0));
                } else {
                    // else, If in our current state, jug2 holds the required amount of water,
                    // then we empty the jug1 and push it into our path.
                    currentPair.path.add(new Pair(0, currentPair.jug2));
                }
                int n = currentPair.path.size();
                System.out.println(
                        "Path of states of jugs followed is :");
                for (int i = 0; i < n; i++)
                    System.out.println(
                            currentPair.path.get(i).jug1 + " , "
                                    + currentPair.path.get(i).jug2);
                return;
            }

            // If we have not yet found the target, then we have three cases left
            // I. Fill the jug and Empty the other II. Fill the jug and let the
            // other remain untouched III. Empty the jug and let the other remain untouched
            // IV. Transfer amounts from one jug to another

            // Please refer to the table attached above to
            // understand the cases that we are taking into consideration

            // Now, I. Fill the jug and Empty the other
            queue.offer(new Pair(jug1, 0, currentPair.path));
            queue.offer(new Pair(0, jug2, currentPair.path));

            // II. Fill the jug and let the other remain untouched
            queue.offer(new Pair(jug1, currentPair.jug2, currentPair.path));
            queue.offer(new Pair(currentPair.jug1, jug2, currentPair.path));

            // III. Empty the jug and let the other remain untouched
            queue.offer(new Pair(0, currentPair.jug2, currentPair.path));
            queue.offer(new Pair(currentPair.jug1, 0, currentPair.path));

            // IV. Transfer water from one to another until
            // one jug becomes empty or until one jug
            // becomes full in this process

            // Transferring water form jug1 to jug2
            int emptyJug = jug2 - currentPair.jug2;
            int amountTransferred
                    = Math.min(currentPair.jug1, emptyJug);
            int j2 = currentPair.jug2 + amountTransferred;
            int j1 = currentPair.jug1 - amountTransferred;
            queue.offer(new Pair(j1, j2, currentPair.path));

            // Transferring water form jug2 to jug1
            emptyJug = jug1 - currentPair.jug1;
            amountTransferred = Math.min(currentPair.jug2, emptyJug);
            j2 = currentPair.jug2 - amountTransferred;
            j1 = currentPair.jug1 + amountTransferred;
            queue.offer(new Pair(j1, j2, currentPair.path));
        }

        System.out.println("Not Possible to obtain target");

    }
}

/*
 Expected output:

Path of states of jugs followed is :
0 , 0
0 , 3
3 , 0
3 , 3
4 , 2
0 , 2

*/