package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Minimum-Spanning Tree (Prims Algorithm):
 * <p></p>
 * Minimum Spanning Tree is a subgraph of Weighted Graph.
 * <p>
 * All vertices of Minimum Spanning Tree are connected with Minimum Spanning Tree.
 * <p>
 * There is no cycle in the Minimum-Spanning Tree.
 * <p>
 * Minimum Edge weight is used in Kruskal's Algorithm.
 * <p></p>
 * 3 rules for Kruskal's Algorithm:
 * <p></p>
 * Must be used Undirected Graph in Kruskal's Algorithm.
 * <p>
 * All Edges must be Unique & Must be connected.
 * <p>
 * All Vertices must be weighted.
 * <p>
 * Time Complexity of Kruskal's Algorithm is O(ElogE).
 */
public class PrimsAlgorithmMST {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        // for 1 -vertex
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        // for 2 -vertex
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        // for 3 -vertex
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair> {
        int Node;
        int nodeCost;

        public Pair(int node, int nodeCost) {
            Node = node;
            this.nodeCost = nodeCost;
        }

        @Override
        public int compareTo(Pair compareWeight) {
            return this.nodeCost - compareWeight.nodeCost;
        }
    }

    // Time Complexity O(ElogE)
    static void primsAlgorithm(ArrayList<Edge>[] graph) {

        boolean[] visited = new boolean[graph.length];
        // Playing a role as a MST set.

        // Priority Queue best uses it for Shortest Path repeated times.
        PriorityQueue<Pair> pairQueue = new PriorityQueue<>();
        // Playing a role as a Non-MST set.

        pairQueue.add(new Pair(0, 0));

        int cost = 0;

        // if a Non-MST set is not empty.
        while (!pairQueue.isEmpty()) {

            // Priority Queue returns Minimum Costs pair by default.
            Pair currentPair = pairQueue.remove();

            // if the Non-MST set is not visited.
            if (!visited[currentPair.Node]) {

                // Add the Node to the MST set.
                visited[currentPair.Node] = true;
                cost += currentPair.nodeCost; // Track the cost.

                for (int i = 0; i < graph[currentPair.Node].size(); i++) {

                    Edge currentEdge = graph[currentPair.Node].get(i);

                    if (!visited[currentEdge.Destination]) {

                        pairQueue.add(
                                new Pair(currentEdge.Destination, currentEdge.Weight));
                    }
                }
            }
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {
        /*

                      0
                  /   |   \
               10/    |    \15
                /     |     \
               1      |30    2
                \     |     /
               40\    |    /50
                  \   |   /
                      3

        */

        int Vertex = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);

        primsAlgorithm(graph);
    }
}

/*Expected Output:

55

* */