package BacktrackingProblems;

// Find if there is a path of more than k length from a source.

import java.util.ArrayList;
import java.util.Arrays;

/*Given a graph, a source vertex in the graph and a number k,
find if there is a simple path (without any cycle) starting
from a given source and ending at any other vertex such that
the distance from source to that vertex is at least ‘k’ length.

Example:

Weighted Undirected AdjacentListGraph

Input: Source s = 0, k = 58
Output : True
There exists a simple path 0 -> 7 -> 1
-> 2 -> 8 -> 6 -> 5 -> 3 -> 4
Which has a total distance of 60 km which
is more than 58.

Input: Source s = 0, k = 62
Output: False

In the above graph, the longest simple path has distance 61 (0 -> 7 -> 1-> 2
 -> 3 -> 4 -> 5-> 6 -> 8, so output should be false for any input greater than 61.
*/
public class FindMorePathFromSource {
    static class AdjacentListNode {
        int vertex, weight;

        AdjacentListNode(int _vertex, int _weight) {
            vertex = _vertex;
            weight = _weight;
        }

    }

    // This class represents a graph using adjacency list representation
    static class AdjacentListGraph {
        int Vertices;  // No. of vertices

        // In a weighted graph, we need to store vertex
        // and weight pair for every edge
        ArrayList<ArrayList<AdjacentListNode>> adjacent;

        // Allocates memory for an adjacency list
        AdjacentListGraph(int Vertices) {
            this.Vertices = Vertices;
            adjacent = new ArrayList<>(Vertices);   // Chaining Instant Method.

            for (int i = 0; i < Vertices; i++) {
                adjacent.add(new ArrayList<>());
            }
        }

        // Utility function to an edge (utility, vertices) of weight w
        void addEdge(int utility, int vertices, int weight) {
            AdjacentListNode node1 = new AdjacentListNode(vertices, weight);
            adjacent.get(utility).add(node1); // Add vertices to utility's list

            AdjacentListNode node2 = new AdjacentListNode(utility, weight);
            adjacent.get(vertices).add(node2); // Add utility to vertex's list
        }

        // Returns true if graph has path more than k lengths
        boolean pathMoreThanK(int source, int k) {

            // Create a path array with nothing included in a path
            boolean[] path = new boolean[Vertices];

            Arrays.fill(path, false);

            path[source] = true;    // Add source vertex to a path

            return pathMoreThanKUtil(source, k, path);
        }

        // Prints shortest paths from source to all other vertices
        boolean pathMoreThanKUtil(int source, int k, boolean[] path) {

            if (k <= 0)         // If k is 0 or negative, return true;
                return true;

            // Get all adjacent vertices of a source vertex source and
            // recursively explore all paths from source.

            for (int i = 0; i < adjacent.get(source).size(); i++) {
                AdjacentListNode vertex = adjacent.get(source).get(i);

                // Get adjacent vertex and weight of edge
                int vertexEdge = vertex.vertex;
                int weightEdge = vertex.weight;

                // increase the-index

                // If vertex vertexEdge is already there in a path, then
                // there is a cycle (we ignore this edge)
                if (path[vertexEdge])
                    continue;

                // If weight of is more than k, return true
                if (weightEdge >= k)
                    return true;

                // Else add this vertex to a path
                path[vertexEdge] = true;

                // If this adjacent can provide a path longer
                // than k, return true.
                if (pathMoreThanKUtil(vertexEdge, k - weightEdge, path))
                    return true;

                // Backtrack
                path[vertexEdge] = false;
            }

            // If no adjacent could produce a longer path, return false
            return false;
        }

    }

    public static void main(String[] args) {
        // create the graph given in the above figure
        int Vertex = 9;
        AdjacentListGraph adjacentListGraph = new AdjacentListGraph(Vertex);

        // Making the above-shown graph

        adjacentListGraph.addEdge(0, 1, 4);
        adjacentListGraph.addEdge(0, 7, 8);
        adjacentListGraph.addEdge(1, 2, 8);
        adjacentListGraph.addEdge(1, 7, 11);
        adjacentListGraph.addEdge(2, 3, 7);
        adjacentListGraph.addEdge(2, 8, 2);
        adjacentListGraph.addEdge(2, 5, 4);
        adjacentListGraph.addEdge(3, 4, 9);
        adjacentListGraph.addEdge(3, 5, 14);
        adjacentListGraph.addEdge(4, 5, 10);
        adjacentListGraph.addEdge(5, 6, 2);
        adjacentListGraph.addEdge(6, 7, 1);
        adjacentListGraph.addEdge(6, 8, 6);
        adjacentListGraph.addEdge(7, 8, 7);

        int source = 0;
        int k = 62;

        if (adjacentListGraph.pathMoreThanK(source, k))
            System.out.println("YES");
        else
            System.out.println("NO");


        k = 60;
        if (adjacentListGraph.pathMoreThanK(source, k))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

/*Expected Output::

NO
YES

* */