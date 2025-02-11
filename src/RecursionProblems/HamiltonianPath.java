package RecursionProblems;

public class HamiltonianPath {
    private final int[][] graph;
    private final int[] path;
    private final int V;

    public HamiltonianPath(int[][] graph) {
        this.graph = graph;
        this.V = graph.length;
        this.path = new int[V];
        for (int i = 0; i < V; i++) {
            path[i] = -1;
        }
    }

    public boolean solve() {
        path[0] = 0; // Start from the first vertex
        return solve(1);
    }

    private boolean solve(int position) {
        if (position == V) {
            return true;
        }

        for (int v = 1; v < V; v++) {
            if (isSafe(v, position)) {
                path[position] = v;
                if (solve(position + 1)) {
                    return true;
                }
                path[position] = -1; // backtrack
            }
        }
        return false;
    }

    private boolean isSafe(int v, int position) {
        if (graph[path[position - 1]][v] == 0) {
            return false;
        }

        for (int i = 0; i < position; i++) {
            if (path[i] == v) {
                return false;
            }
        }
        return true;
    }

    public void printSolution() {
        for (int i = 0; i < V; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {1, 1, 0, 1, 1, 0},
            {0, 1, 1, 0, 1, 1},
            {0, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 1, 0}
        };

        HamiltonianPath hamiltonianPath = new HamiltonianPath(graph);
        if (hamiltonianPath.solve()) {
            hamiltonianPath.printSolution();
        } else {
            System.out.println("No solution exists.");
        }
    }
}
