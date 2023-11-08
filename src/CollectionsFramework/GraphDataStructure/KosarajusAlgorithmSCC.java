package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Kosaraju-Sharir's Algorithm (Strongly Connected Components)
 * Kosaraju's algorithm) is a linear time algorithm to find
 * the strongly connected components of a directed graph.
 */
/* Using Modified Depth-First Search (DFS) algorithm.
 For finding Strongly Connected Components.
 First visit a vertex, which has no outgoing edges.(A Reversed DFS).
 Then visit all the vertices which are reachable from this vertex.*/
public class KosarajusAlgorithmSCC {
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

    static void topSort(ArrayList<Edge>[] graph,
                        int curr, Stack<Integer> s, boolean[] visited) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.Destination]) {
                topSort(graph, e.Destination, s, visited);
            }
        }
        s.push(curr);
    }

    static void dfs(ArrayList<Edge>[] graph, boolean[] visited, int curr) {

        visited[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge currentEdge = graph[curr].get(i);

            if (!visited[currentEdge.Destination]) {
                dfs(graph, visited, currentEdge.Destination);
            }
        }
    }

    static void KosarajusAlgorithm(ArrayList<Edge>[] graph, int Vertex) {

        // Step 1
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[Vertex];
        for (int i = 0; i < Vertex; i++) {
            if (!visited[i]) {
                topSort(graph, i, s, visited);
            }
        }

        //Step 2
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] transpose = new ArrayList[Vertex];
        for (int i = 0; i < Vertex; i++) {
            transpose[i] = new ArrayList<>();
        }
        for (int i = 0; i < Vertex; i++) {

            visited[i] = false;

            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.Destination].add(new Edge(e.Destination, e.Source));
            }
        }
        // Step 3
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visited[curr]) {
                System.out.print("SCC : ");
                dfs(transpose, visited, curr);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        /*

        1 ---- > 0 -------> 3
       ^|      /            |
        |    /              |
        |  /<               |<
        2                   4

        */

        int Vertex = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);

        KosarajusAlgorithm(graph, Vertex); // Time Complexity O(V+E)
    }
}

/*Expected Output:

SCC : 0 1 2
SCC : 3
SCC : 4

* */