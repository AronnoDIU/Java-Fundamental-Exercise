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
        int v;
        int wt;

        public Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.wt - p2.wt;
        }
    }

    // Time Complexity O(ElogE)
    static void primsAlgorithm(ArrayList<Edge>[] graph) {

        boolean[] visited = new boolean[graph.length];

        PriorityQueue<Pair> pairQueue = new PriorityQueue<>();

        pairQueue.add(new Pair(0, 0));

        int cost = 0;

        while (!pairQueue.isEmpty()) {

            Pair curr = pairQueue.remove();

            if (!visited[curr.v]) {

                visited[curr.v] = true;
                cost += curr.wt;

                for (int i = 0; i < graph[curr.v].size(); i++) {

                    Edge currentEdge = graph[curr.v].get(i);

                    if (!visited[currentEdge.Destination]) {

                        pairQueue.add(new Pair(currentEdge.Destination, currentEdge.Weight));
                    }
                }
            }
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {
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