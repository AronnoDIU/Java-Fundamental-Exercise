package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

/**
 * Graph Data Structure Implementation ==> Network of Nodes.
 * Adjacency List ==> List of Lists [Using this for crating Graph]
 * Vertex will be presented as Index
 * Edge will be presented as ArrayList's List;
 * It is also possible with Hashmap; there, Vertex will be Key & List will be value;
 */
public class GraphCreation {
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

    public static void main(String[] args) {
        /*
              (5)
            0 ----- 1
                  /   \
              (1)/     \(3)
                /       \
                2 ------ 3
                |   (1)
             (2)|
                |
                4
         */
        int Vertex = 5;
        // int[] array = new int[Vertex];
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex]; // Currently Null Stored.

        for (int i = 0; i < Vertex; i++) {
            graph[i] = new ArrayList<>();
        }
        // for 0 -vertex
        graph[0].add(new Edge(0, 1, 5));

        // for 1 -vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // for 2 -vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        // for 3 -vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // for 4 -vertex
        graph[4].add(new Edge(4, 2, 2));

        // for 2's neighbors — vertex information check in graph.
        for (int i = 0; i < graph[2].size(); i++) {
            System.out.println("Source: " + graph[2].get(i).Source + " Destination: "
                    + graph[2].get(i).Destination + " Weight: " + graph[2].get(i).Weight);
        }
    }
}

/*Expected Output:

Source: 2 Destination: 1 Weight: 1
Source: 2 Destination: 3 Weight: 1
Source: 2 Destination: 4 Weight: 4

* */