package BacktrackingProblems;

/*Given an undirected graph and a number m, determine if the graph can be
colored with at most m colors such that no two adjacent vertices of the
graph are colored with the same color*/

/*Naive Approach: To solve the problem follow the below idea:

    Generate all possible configurations of colors. Since each node can be colored
    using any of the m available colors, the total number of color configurations
    possible is mV. After generating a configuration of color, check if the
    adjacent vertices have the same color or not. If the conditions are met,
    print the combination and break the loop

Follow the given steps to solve the problem:

    Create a recursive function that takes the current index,
    number of vertices and output color array
    If the current index is equal to the number of vertices.
    Check if the output color configuration is safe, i.e., check if the adjacent
    vertices do not have the same color. If the conditions are met, print the configuration and break
    Assign a color to a vertex (1 to m)
    For every assigned color recursively call the function with next index and number of vertices
    If any recursive function returns true break the loop and returns true.*/
public class ColoringGraph {
    // Number of vertices in the graph
    static int VerticesNumber = 4;

    /* A utility function to print a solution */
    static void printSolution(int[] color) {
        System.out.println(
                "Solution Exists:"
                        + " Following are the assigned colors ");
        for (int i = 0; i < VerticesNumber; i++)
            System.out.print("  " + color[i]);
        System.out.println();
    }

    // check if the colored graph is safe or not.
    static boolean isSafe(boolean[][] graph, int[] color) {
        // check for every edge
        for (int i = 0; i < VerticesNumber; i++)
            for (int j = i + 1; j < VerticesNumber; j++)
                if (graph[i][j] && color[j] == color[i])
                    return false;
        return true;
    }

    /* This function solves the m Coloring problem using recursion. It returns
      false if the m colors cannot be assigned, otherwise, return true and prints
      assignments of colors to all vertices. Please note that there may be more than
      one solution, this function prints one of the feasible solutions.*/
    static boolean
    graphColoring(boolean[][] graph, int m, int currentIndex, int[] color) {
        // if the current index reached an end
        if (currentIndex == VerticesNumber) {

            // if coloring is safe
            if (isSafe(graph, color)) {

                // Print the solution
                printSolution(color);
                return true;
            }
            return false;
        }

        // Assign each color from 1 to m
        for (int j = 1; j <= m; j++) {
            color[currentIndex] = j;

            // Recur of the rest vertices
            if (graphColoring(graph, m, currentIndex + 1, color))
                return true;
            color[currentIndex] = 0;
        }
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        /* Create the following graph and test whether it is 3 colorable
                                (3)---(2)
                                | / |
                                | / |
                                | / |
                                (0)---(1)
                        */
        boolean[][] graph = {
                {false, true, true, true},
                {true, false, true, false},
                {true, true, false, true},
                {true, false, true, false},
        };
        int m = 3; // Number of colors

        // Initialize all color values as 0. This initialization is needed
        // correct functioning of isSafe()
        int[] color = new int[VerticesNumber];

        // Function call
        if (!graphColoring(graph, m, 0, color))
            System.out.println("Solution does not exist");
    }
}

/*Expected Output::

Solution Exists: Following are the assigned colors
  1  2  3  2

* */
