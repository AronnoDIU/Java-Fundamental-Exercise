package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// For given graph, find if there is a path from 0 to 5.
// For a given source and destination, if there is a path exists from source to destination.
// Using Depth-First Search ==> Keep going to the first neighbors.
public class FindHasPath {
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

    // Array of ArrayList<Edge> ==> Adjacency List/ List of Lists
    static void createGraph(ArrayList<Edge>[] graph) {
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

    // For given graph, find if there is a path from 0 to 5.
    static boolean hasPath(ArrayList<Edge>[] graph, int source,
                           int destination, boolean[] visited) {
        if (source == destination) {
            return true;
        }

        visited[source] = true; // Mark source as visited.

        // Goal to ensure that each Node is visited once.
        for (int i = 0; i < graph[source].size(); i++) {
            Edge currentEdge = graph[source].get(i);

            // currentEdge.Destination = neighbor.
            if (!visited[currentEdge.Destination]
                    && hasPath(graph, currentEdge.Destination, destination, visited)) {
                return true;
            }
        }
        return false;
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
        ArrayList<Edge>[] graph = new ArrayList[Vertex]; // Adjacency List
        createGraph(graph); // Calling the function to create the graph.
        DFS(graph, 0, new boolean[Vertex]); // Calling the DFS function.
        System.out.print("\nSource: " + 0 + " Destination: " + 5 + " path exists? ");
        System.out.println(hasPath(graph, 0, 5,
                new boolean[Vertex]) ? "Yes" : "No"); // Using ternary operator.
    }
}

/*Expected Output:

0 1 3 4 2 5 6
Source: 0 Destination: 5 path exists? Yes

* */