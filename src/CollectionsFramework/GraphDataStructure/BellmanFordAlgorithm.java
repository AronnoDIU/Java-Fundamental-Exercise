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

 Bellman-Ford Algorithm doesn't work when there is a negative weight cycle.

  (A)<--------\
     \         \c
     a\         \
      >\         \
       (B)--------> (C)
             b

      if, a + b + c < 0, then there is a negative weight cycle.
   Bellman-Ford Algorithm doesn't work when there is a negative weight cycle.
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

        // for 4-vertex
//        graph[4].add(new Edge(4, 1, -1));

        // For Detecting Negative Weight Cycle replace with 4-vertex
        graph[4].add(new Edge(4, 1, -10));
    }

    // Time Complexity O(V*E) where V is number of vertices and E is numbered of edges.
    static void bellmanFord(ArrayList<Edge>[] graph, int Source) {

        // graph.length = Total number of vertices.
        int[] Distance = new int[graph.length];

        // Initialized all distances as INFINITE.
        for (int i = 0; i < Distance.length; i++) {
            // Distance.length == Total number of vertices == graph.length.

            if (i != Source) // If Node is not equal to Source.

                // Initialized Negative to positive weight.
                Distance[i] = Integer.MAX_VALUE;
        }

        // Bellman-Ford Algorithm for Outer Loop.
        // N-1 times, N = Total Number of Vertices.
        for (int i = 0; i < graph.length - 1; i++) {
            // graph.length = Total number of vertices.

            // To find all Edges from Vertices.
            // graph.length = Total number of vertices.
            for (ArrayList<Edge> edgesList : graph) {

                /*for (int j = 0; j < graph[edgesList].size(); j++) {
                    Edge currentEdge = graph[edgesList].get(j);*/
                for (Edge currentEdge : edgesList) { // get all edges.

                    int initialVelocity = currentEdge.Source; // Source as U.
                    int finalVelocity = currentEdge.Destination; // Destination as V.
                    int weight = currentEdge.Weight; // Weight of the Edge.

                    // Performing Relaxation of Edges.
                    if (Distance[initialVelocity] != Integer.MAX_VALUE // Additional condition.
                            // Distance[initialVelocity] should not equal Integer.MAX_VALUE

                            && Distance[initialVelocity] + weight < Distance[finalVelocity]) {

                        // Update Distance of Path from initialV to finalVelocity.
                        Distance[finalVelocity] = Distance[initialVelocity] + weight;
                    }
                }
            }
        }

        // For Detecting Negative Weight Cycle.
        for (ArrayList<Edge> edgesList : graph) {

                /*for (int j = 0; j < graph[edgesList].size(); j++) {
                    Edge currentEdge = graph[edgesList].get(j);*/
            for (Edge currentEdge : edgesList) { // get all edges.

                int initialVelocity = currentEdge.Source; // Source as U.
                int finalVelocity = currentEdge.Destination; // Destination as V.
                int weight = currentEdge.Weight; // Weight of the Edge.

                // Performing Relaxation of Edges.
                if (Distance[initialVelocity] != Integer.MAX_VALUE // Additional condition.
                        // Distance[initialVelocity] should not equal Integer.MAX_VALUE

                        && Distance[initialVelocity] + weight < Distance[finalVelocity]) {

                    System.out.println("Negative Weight Cycle Exists.");
                    break;
                }
            }
        }

        // Printing Shortest Distance
        for (int i = 0; i < Distance.length; i++) {
            System.out.println("Shortest Path from Source to Node "
                    + i + " : " + Distance[i]);
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

Negative Weight Cycle Exists.
Shortest Path from Source to Node 0 : 0
Shortest Path from Source to Node 1 : -30
Shortest Path from Source to Node 2 : -26
Shortest Path from Source to Node 3 : -24
Shortest Path from Source to Node 4 : -20

* */