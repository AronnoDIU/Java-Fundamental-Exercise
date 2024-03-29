package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;
import java.util.Stack;

// Topological Sort (Directed Graph) using Modified Depth-First Search.
public class TopologicalSortDFS {
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

    // Time Complexity = O(V+E)
    static void topologicalSortUtil(ArrayList<Edge>[] graph, int currentVertex,
                                    boolean[] visited, Stack<Integer> integerStack) {
        visited[currentVertex] = true;

        for (int i = 0; i < graph[currentVertex].size(); i++) {
            Edge currentEdge = graph[currentVertex].get(i);
            if (!visited[currentEdge.Destination]) {
                topologicalSortUtil(graph, currentEdge.Destination, visited, integerStack);
            }
        }
        integerStack.push(currentVertex);
    }

    // Time Complexity = O(V+E)
    static void topologicalSort(ArrayList<Edge>[] graph) {
        boolean[] InDegree = new boolean[graph.length];
        Stack<Integer> integerStack = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!InDegree[i]) {
                topologicalSortUtil(graph, i, InDegree, integerStack);
            }
        }

        // DFS traversal.
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop() + " ");
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
        topologicalSort(graph);
    }
}

/*Expected Output:

5 4 2 3 1 0

* */