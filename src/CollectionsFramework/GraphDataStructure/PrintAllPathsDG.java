package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// Print all paths from Source to Destination using Depth-First Search.
// For a Directed Graph.
public class PrintAllPathsDG {
    static class Edge {
        int Source;
        int Destination;

        public Edge(int source, int destination) {
            Source = source;
            Destination = destination;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void main(String[] args) {
        /*
             5              4
             |  \         / |
             |   \      /   |
             |    > 0 <     |
             |      |       |
             >      |<      <
             2---->3------->1
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

0 -> 1 -> 3 -> 4 -> 5
0 -> 1 -> 3 -> 5
0 -> 2 -> 4 -> 3 -> 5
0 -> 2 -> 4 -> 5

* */