package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;
import java.util.Stack;

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

    static void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis,
                                    Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.Destination]) {
                topologicalSortUtil(graph, e.Destination, vis, s);
            }
        }
        s.push(curr);
    }

    //O(V+E)
    static void topologicalSort(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topologicalSortUtil(graph, i, vis, s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void main(String[] args) {
        /*
             5              4
             |  \         / |
             |   \      /   |
             |    > 0 <     |
             |              |
             >              <
             2---->3------->1
         */
        int Vertex = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex]; // Adjacency List.
        createGraph(graph); // Calling the function to create the graph.
    }
}
