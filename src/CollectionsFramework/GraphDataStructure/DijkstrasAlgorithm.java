package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

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
            if (i == Source) {
                Distance[i] = 0;
            } else {    // if Node is not equal to Source.
                Distance[i] = Integer.MAX_VALUE; // Initialize the Distance to MAX/Infinity.
            }
            visited[i] = false;
        }
//        Distance[Source] = 0;
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
    }
}

/*Expected Output:

 -> 5 -> 0 -> 3 -> 1
 -> 5 -> 2 -> 3 -> 1

* */