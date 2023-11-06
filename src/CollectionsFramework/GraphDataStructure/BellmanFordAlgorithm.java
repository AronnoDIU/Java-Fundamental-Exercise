package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// Time Complexity of Bellman-Ford Algorithm is greater than Dijkstra's Algorithm.
/**
 * Bellman Ford's Algorithm works when there is a negative weight edge,
 * <p>
 * it also detects the negative weight cycle.
 * <p>
 * Dijkstra's Algorithm doesn't work when there is a negative weight edge.
 * <p></p>
 * Principle of Relaxation of Edges for Bellman-Ford:
 * <p>
 * 1. It states that for the graph having N vertices,
 * all the edges should be relaxed N-1 times to compute the single source the shortest path.
 * <p>
 * 2. To detect whether a negative cycle exists or not,
 * relax all the edge one more time,
 * and if the shortest distance for any node reduces,
 * then we can say that a negative cycle exists.
 * In short, if we relax the edges N times,
 * and there is any change in the shortest distance of any node between the N-1th
 * and Nth relaxation than a negative cycle exists,
 * otherwise not exist.
 */
// Bellman Ford Algorithm (Shortest Distance)
// Shortest Distance from Source to All Vertices.
// Perform this operation N-1 times.[N = Total Number of Vertices]
    /*Perform Relaxation of Edges,
    for all Edges(U, V) such that,
       if (Distance(U) + Weight(U, V) < Distance(V))
       then Distance(V) = Distance(U) + Weight(U, V).
    * */
public class BellmanFordAlgorithm {
    static class Edge {
        int Source;
        int Destination;
        int Weight;

        public Edge(int source, int destination, int weight) {
            Source = source;
            Destination = destination;
            Weight = weight;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // for 0 -vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // for 1 -vertex
        graph[1].add(new Edge(1, 2, -4));

        // for 2 -vertex
        graph[2].add(new Edge(2, 3, 2));

        // for 3 -vertex
        graph[3].add(new Edge(3, 4, 4));

        // for 4 -vertex
        graph[4].add(new Edge(4, 1, -1));
    }

    // Time Complexity O(V*E) where V is number of vertices and E is numbered of edges.
    static void bellmanFord(ArrayList<Edge>[] graph, int Source) {
        int[] Destination = new int[graph.length];
        for (int i = 0; i < Destination.length; i++) {
            if (i != Source)

                Destination[i] = Integer.MAX_VALUE; // Negative weight cycle
        }

        // Time Complexity O(V)
        for (int i = 0; i < graph.length - 1; i++) {

            // Edges Time Complexity - O(E)
            for (ArrayList<Edge> edges : graph) {

                for (Edge currentEdge : edges) {
                    int u = currentEdge.Source;
                    int v = currentEdge.Destination;
                    int wt = currentEdge.Weight;
                    if (Destination[u] != Integer.MAX_VALUE
                            && Destination[u] + wt < Destination[v]) {

                        Destination[v] = Destination[u] + wt;
                    }
                }
            }
        }
        //Detecting Negative Weight Cycle
        for (ArrayList<Edge> edges : graph) {
            for (Edge currentEdge : edges) {
                int u = currentEdge.Source;
                int v = currentEdge.Destination;
                int wt = currentEdge.Weight;
                if (Destination[u] != Integer.MAX_VALUE
                        && Destination[u] + wt < Destination[v]) {

                    System.out.println("negative weight cycle exists");
                    break;
                }
            }
        }

        // Printing Shortest Distance
        for (int i = 0; i < Destination.length; i++) {
            System.out.println("Shortest Path from Source to Node "
                    + i + " : " + Destination[i]);
        }
    }

    public static void main(String[] args) {
        /*
                  -1
             1<--------------4
           ^/|              /
          2/ |-4           /^
          /  |<           /4
        0--->2---------->3
          4        2
        * */

        int Vertex = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);

        int Source = 0;

        bellmanFord(graph, Source);
    }
}

/*Expected Output:

Shortest Path from Source to Node 0 : 0
Shortest Path from Source to Node 1 : 2
Shortest Path from Source to Node 2 : -2
Shortest Path from Source to Node 3 : 0
Shortest Path from Source to Node 4 : 4

* */