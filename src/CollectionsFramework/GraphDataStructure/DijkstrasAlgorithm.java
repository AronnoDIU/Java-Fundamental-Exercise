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

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
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

        int source = 5;
        int destination = 1;
    }
}

/*Expected Output:

 -> 5 -> 0 -> 3 -> 1
 -> 5 -> 2 -> 3 -> 1

* */