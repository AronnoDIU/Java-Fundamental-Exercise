package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Dijkstra's Algorithm => is an algorithm for finding the shortest paths between
 * nodes in a weighted graph, where the weight of each edge is non-negative.
 */
// Find the shortest path from Source to All Vertices(Weighted Graph).
// Using Priority-Queue(Min-Heap) for finding the shortest path.
public class DijkstrasAlgorithm {
    static class Edge {
        int Source;
        int Destination;
        int Weight;

        public Edge(int Source, int Destination, int Weight) {
            this.Source = Source;
            this.Destination = Destination;
            this.Weight = Weight;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int Node;
        int ShortestPath; // Weight of the Shortest Path from Source to Node.

        public Pair(int node, int shortestPath) {
            Node = node;
            ShortestPath = shortestPath;
        }

        @Override // Compares the Shortest Path from Source to Node.
        public int compareTo(Pair compair) { // Objects are compared.
            return this.ShortestPath - compair.ShortestPath;
            // Path based sorting for pairs.
            // The shortest Path is using Priority-Queue.
        }
    }

    static void Dijkstras(ArrayList<Edge>[] graph, int Source) {
        int[] Distance = new int[graph.length]; // Distance from Source to Node.
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (i != Source) {
                // If Node is not equal to Source. Because, Source to Source is always 0.
                Distance[i] = Integer.MAX_VALUE; // Initialize the Distance to MAX/Infinity.
            }
        }

        // Priority-Queue for Shortest Path.
        PriorityQueue<Pair> pairPQ = new PriorityQueue<>();
        pairPQ.add(new Pair(Source, 0)); // Add the Source to the Priority-Queue.

        // While the Priority-Queue is not empty.
        while (!pairPQ.isEmpty()) { // While loop for Breadth First Search.
            Pair currentPair = pairPQ.poll();
            // Remove the Shortest Path from Source to Node.

            // If Node is already visited, skip it.
            if (!visited[currentPair.Node]) { // If Node is not visited.

                visited[currentPair.Node] = true; // Node is visited.

                // These are the Shortest Path from Source to Node
                // and the Weight of the Shortest Path for the Next Node/Neighbors.
                for (int i = 0; i < graph[currentPair.Node].size(); i++) {
                    Edge currentEdge = graph[currentPair.Node].get(i);

                    if (Distance[currentEdge.Destination]
                            > Distance[currentPair.Node] + currentEdge.Weight) {

                        // If the Shortest Path from Source to Node is greater
                        // than the Shortest Path
                        Distance[currentEdge.Destination]
                                = Distance[currentPair.Node] + currentEdge.Weight;

                        pairPQ.add(new Pair(currentEdge.Destination,
                                Distance[currentEdge.Destination]
                                        + currentEdge.Weight));

                        Distance[currentEdge.Destination]
                                = Distance[currentPair.Node] + currentEdge.Weight;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        /*
                         7
                 ^1------------->3
                / |              ^  \
              2/  |              |   \1
              /   |              |    \>
            0     |1             |2     5
              \   |              |    />
              4\  |              |   /5
                \ |<             |  /
                 >2-------------->4
                          3
         */
        int Vertex = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);

        int source = 0;
        Dijkstras(graph, source);
    }
}

/*Expected Output:

 -> 5 -> 0 -> 3 -> 1
 -> 5 -> 2 -> 3 -> 1

* */