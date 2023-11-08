package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;
import java.util.Stack;

// Kosaraju-Sharir's Algorithm (Strongly Connected Components)
// Kosaraju's algorithm) is a linear time algorithm to find
// the strongly connected components of a directed graph.
public class KosarajusAlgorithm {
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

        // for 0 -vertex
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // for 1 -vertex
        graph[1].add(new Edge(1, 0));

        // for 2 -vertex
        graph[2].add(new Edge(2, 1));

        // for 3 -vertex
        graph[3].add(new Edge(3, 4));
    }

    static void topSort(ArrayList<Edge>[] graph, int curr, Stack<Integer> s,
                        boolean[] vis) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.Destination]) {
                topSort(graph, e.Destination, s, vis);
            }
        }
        s.push(curr);
    }

    static void dfs(ArrayList<Edge>[] graph, boolean[] vis, int curr) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.Destination]) {
                dfs(graph, vis, e.Destination);
            }
        }
    }

    static void kosaraju(ArrayList<Edge>[] graph, int V) {

        // Step 1
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, s, vis);
            }
        }

        //Step 2
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            vis[i] = false;
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.Destination].add(new Edge(e.Destination, e.Source));
            }
        }
        // Step 3
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                System.out.print("SCC : ");
                dfs(transpose, vis, curr);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}

/*Expected Output:

SCC : 0 1 2
SCC : 3
SCC : 4

* */