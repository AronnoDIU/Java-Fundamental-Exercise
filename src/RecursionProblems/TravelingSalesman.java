package RecursionProblems;

import java.util.Arrays;

public class TravelingSalesman {
    private final int[][] graph;
    private final int n;
    private final int[][] dp;
    private final int VISITED_ALL;

    public TravelingSalesman(int[][] graph) {
        this.graph = graph;
        this.n = graph.length;
        this.VISITED_ALL = (1 << n) - 1;
        this.dp = new int[n][1 << n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
    }

    public int tsp(int mask, int pos) {
        if (mask == VISITED_ALL) {
            return graph[pos][0];
        }
        if (dp[pos][mask] != -1) {
            return dp[pos][mask];
        }

        int ans = Integer.MAX_VALUE;
        for (int city = 0; city < n; city++) {
            if ((mask & (1 << city)) == 0) {
                int newAns = graph[pos][city] + tsp(mask | (1 << city), city);
                ans = Math.min(ans, newAns);
            }
        }
        return dp[pos][mask] = ans;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        TravelingSalesman tsp = new TravelingSalesman(graph);
        int result = tsp.tsp(1, 0);
        System.out.println("The minimum cost is: " + result);
    }
}
