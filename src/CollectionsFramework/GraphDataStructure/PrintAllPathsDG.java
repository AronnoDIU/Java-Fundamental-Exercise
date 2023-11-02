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

        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Exponential Time Complexity O(V^V).
    static void printAllPaths(ArrayList<Edge>[] graph,
                              int Source, int Destination, String Path) {

        if (Source == Destination) {    // Base Case
            System.out.println(Path + " -> " + Destination);
            return;
        }

        for (int i = 0; i < graph[Source].size(); i++) {
            Edge currentEdge = graph[Source].get(i);

            printAllPaths(graph, currentEdge.Destination,
                    Destination, Path + " -> " + Source);
        }
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

        printAllPaths(graph, source, destination, "");
    }
}

/*Expected Output:

 -> 5 -> 0 -> 3 -> 1
 -> 5 -> 2 -> 3 -> 1

* */