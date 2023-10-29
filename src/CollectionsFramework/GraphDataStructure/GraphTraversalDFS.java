package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

/**
 * Graph Traversal using Depth-First Search
 * Rules for DFS ==> Keep going to the first neighbors.
 * We are using Recursion using implicit Stack.
 */
public class GraphTraversalDFS {
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

    static void createGraph(ArrayList<Edge>[] graph) {  // Adjacency List
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // for 0 -vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // for 1 -vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // for 2 -vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // for 3 -vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // for 4 -vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // for 5 -vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // for 6 -vertex
        graph[5].add(new Edge(6, 5, 1));
    }

    static void DFS(ArrayList<Edge>[] graph,
                    int currentList, boolean[] visited) { // Time Complexity = O(V + E).
        // Goal to ensure that each Node is visited once.
        if (visited[currentList]) { // If currentElement is not visited.
            return;
        }
        System.out.print(currentList + " ");
        visited[currentList] = true; // Mark currentElement as visited.

        for (int i = 0; i < graph[currentList].size(); i++) { // For each neighbor
            Edge currentEdge = graph[currentList].get(i); // of currentElement.
            DFS(graph, currentEdge.Destination, visited);
        }
    }

    public static void main(String[] args) {
        /*
            1 ---- 3
           /       |  \
          0        |   5 --- 6
           \       |  /
            2 ---- 4
            */

        int Vertex = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);
        DFS(graph, 0, new boolean[Vertex]);
    }
}

/*Expected Output:

0 1 2 3 4 5 6

* */