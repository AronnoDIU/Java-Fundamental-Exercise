package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Kosaraju-Sharir's Algorithm (Strongly Connected Components)
 * Kosaraju's algorithm) is a linear time algorithm to find
 * the strongly connected components of a directed graph.
 * <p>
 * 3 Steps to find Strongly Connected Components:
 * <p>
 * 1. Get nodes in stack (as stored topological sort).
 * <p>
 * 2. Transpose the graph[N.B. if a Matrix is 3*3 then transpose is 4*3, Reversed].
 * <p>
 * 3. Do DFS according to the stack nodes on the transposed graph.
 */
/* Using Modified Depth-First Search (DFS) algorithm.
 For finding Strongly Connected Components.
 First visit a vertex, which has no outgoing edges.(A Reversed DFS).
 Then visit all the vertices which are reachable from this vertex.

 Transpose the graph[N.B. if a Matrix is 3*3 then transpose is 4*3, Reversed].
 (Two or more things to exchange places are called Transpose)
 (Transpose in Graph: if A is connected to B then B is connected to A)
 (So we need to reverse the direction of the edges in the graph to make it transposed).

 Strongly Connected Components: Only for directed graphs.

 (Do Normal DFS then push to Stack while backtracking.)
 */
public class KosarajusAlgorithmSCC {
    static class Edge {
        int Source;
        int Destination;

        // Weight value is Not Required for Kosaraju's Algorithm
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

    // Time Complexity of Topological Sort = O(V+E)
    static void topologicalSort(ArrayList<Edge>[] graph,
                                int currentNode, Stack<Integer> stack, boolean[] visited) {

        // Mark as visited first so that it is not visited again.
        visited[currentNode] = true;

        // For all neighbors of currentNode
        for (int i = 0; i < graph[currentNode].size(); i++) {

            Edge currentEdge = graph[currentNode].get(i); // get the Edge.

            // Neighbor will be the currentEdge.Destination
            if (!visited[currentEdge.Destination]) {
                topologicalSort(graph, currentEdge.Destination, stack, visited);
            }
        }
        stack.push(currentNode);
    }

    // Time Complexity of DFS = O(V+E)
    static void ModifiedDFS(ArrayList<Edge>[] graph, boolean[] visited, int curr) {

        visited[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge currentEdge = graph[curr].get(i);

            if (!visited[currentEdge.Destination]) {
                ModifiedDFS(graph, visited, currentEdge.Destination);
            }
        }
    }

    // Time Complexity of DFS = O(V+E)
    static void KosarajusAlgorithm(ArrayList<Edge>[] graph, int Vertex) {

        // Step 1 (Do Normal DFS then push to Stack while backtracking)
        // Pop from Stack will be top Sorted Order which will be used in Step 2.
        Stack<Integer> stack = new Stack<>();
        // Stored topological order in stack.

        boolean[] visited = new boolean[Vertex];

        // For all vertices
        for (int i = 0; i < Vertex; i++) {

            // If a vertex is not visited yet, then call topSort() function.
            if (!visited[i]) {

                // Here, i => current vertex.
                topologicalSort(graph, i, stack, visited);
            }
        }

        //Step 2 (Transpose the graph -> Reversed the Edge direction)
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
        // Step 3 (Do DFS according to the stack nodes on the transposed graph).
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!visited[curr]) {
                System.out.print("SCC : ");
                ModifiedDFS(transpose, visited, curr);
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