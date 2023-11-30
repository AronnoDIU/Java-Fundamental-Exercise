package CollectionsFramework.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class WaterConnection {
    // number of houses and number
    // of pipes
    static int number_of_houses, number_of_pipes;

    // Array rd stores the
    // ending vertex of pipe
    static int[] ending_vertex_of_pipes = new int[1100];

    // Array wd stores the value
    // of diameters between two pipes
    static int[] diameter_of_pipes = new int[1100];

    // Array cd stores the
    // starting end of pipe
    static int[] starting_vertex_of_pipes = new int[1100];

    // arraylist a, b, c are used
    // to store the final output
    static List<Integer> a = new ArrayList<Integer>();

    static List<Integer> b = new ArrayList<Integer>();

    static List<Integer> c = new ArrayList<Integer>();

    static int ans;

    static int dfs(int w) {
        if (starting_vertex_of_pipes[w] == 0)
            return w;
        if (diameter_of_pipes[w] < ans)
            ans = diameter_of_pipes[w];

        return dfs(starting_vertex_of_pipes[w]);
    }

    // Function to perform calculations.
    static void solve(int[][] arr) {
        int i = 0;

        while (i < number_of_pipes) {

            int q = arr[i][0];
            int h = arr[i][1];
            int t = arr[i][2];

            starting_vertex_of_pipes[q] = h;
            diameter_of_pipes[q] = t;
            ending_vertex_of_pipes[h] = q;
            i++;
        }

        a = new ArrayList<Integer>();
        b = new ArrayList<Integer>();
        c = new ArrayList<Integer>();

        for (int j = 1; j <= number_of_houses; ++j)

            /*If a pipe has no ending vertex
            but has starting vertex i.e is
            an outgoing pipe then we need
            to start DFS with this vertex.*/
            if (ending_vertex_of_pipes[j] == 0
                    && starting_vertex_of_pipes[j] > 0) {
                ans = 1000000000;
                int w = dfs(j);

                // We put the details of
                // component in a final output
                // array
                a.add(j);
                b.add(w);
                c.add(ans);
            }

        System.out.println(a.size());

        for (int j = 0; j < a.size(); ++j)
            System.out.println(a.get(j) + " " + b.get(j)
                    + " " + c.get(j));
    }

    public static void main(String[] args) {
        int n = 9;
        int[] p = {7, 5, 4, 2, 9, 3, 6, 8, 1};
        int[] q = {4, 9, 6, 8, 7, 1, 3, 2, 5};
        int[] d = {98, 72, 10, 22, 17, 66, 75, 41, 82};
        int[] result = solve(n, p, q, d);
        for (int j : result) {
            System.out.print(j + " ");
        }
        // 4 5 5 2 2 0 0 0 0
    }
}
