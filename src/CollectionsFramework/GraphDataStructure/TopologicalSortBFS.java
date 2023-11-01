package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

/**
 * Topological Sort using BFS.
 * <p>
 * Kahn's algorithm.In-degree == Incoming Edges.Out-degree == Outgoing Edges.
 * A DAG is a Directed Acyclic Graph (DAG).
 * That means there is no cycle exists in a DAG.
 * If there is a cycle exists then Topological Sort is not possible.
 * If we find the longest path in a DAG, then it is called a Topological Sort.
 * And it has at least one starting vertex with in-degree 0
 * and at least one vertex with out-degree 0.(In general).
 * Fact: A DAG has at least one vertex with in-degree 0
 * and at least one vertex with out-degree 0.
 */
public class TopologicalSortBFS {
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

        // for 2 -vertex
        graph[2].add(new Edge(2, 3));

        // for 3 -vertex
        graph[3].add(new Edge(3, 1));

        // for 4 -vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // for 5 -vertex
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void main(String[] args) {

    }
}

/*Expected Output:

0 1 3 4 2 5 6
Source: 0 Destination: 5 path exists? Yes

* */