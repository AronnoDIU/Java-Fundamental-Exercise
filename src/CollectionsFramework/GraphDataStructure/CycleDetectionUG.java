package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// Cycle Detection (Undirected Graph) using Modified Depth-First Search.
public class CycleDetectionUG {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));
//        graph[0].add(new Edge(0, 3));

        // for 1 -vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        // for 2 -vertex
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        // for 3 -vertex
        graph[3].add(new Edge(3, 2));
//        graph[3].add(new Edge(3, 4));

        // for 4 -vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        // for 5-vertex
//        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
//        graph[5].add(new Edge(5, 6));
    }

    static boolean isCyclicUtil(ArrayList<Edge>[] graph,
                                boolean[] visited, int currentNode, int Parent) {

        visited[currentNode] = true; // Initially mark the current node as visited.

        for (int i = 0; i < graph[currentNode].size(); i++) {

            Edge currentEdge = graph[currentNode].get(i); // Get the current edge.
            // Neighbor will be the currentEdge.Destination

            // Case 1-> if the neighbor is already visited & != Parent
            if (visited[currentEdge.Destination] && currentEdge.Destination != Parent) {

                boolean isCycle = isCyclicUtil(graph,
                        visited, currentEdge.Destination, currentNode);

                if (isCycle) // Cycle exists
                    return true;
            }

            // Case 2-> if the neighbor is not visited & == Parent
//            else if (currentEdge.Destination == Parent) {
//                continue;
//            }

            // Case 3-> if the neighbor is not visited & != Parent
            else {
                return true; // Cycle exists
            }
        }
        return false;
    }

    // Time Complexity = O(V+E)
    static boolean isCyclicUndirected(ArrayList<Edge>[] graph, boolean[] visited) {
        for (int i = 0; i < graph.length; i++) {
            if (isCyclicUtil(graph, visited, i, -1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
             1 -------  2
           / |          |
          /  |          |
        0    |          3
          \  |
           \ |
             4--------5
        */

        int Vertex = 6; // Number of vertices

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex]; // Undirected Adjacency List

        createGraph(graph); // Calling the function to create the graph.
        System.out.println(isCyclicUndirected(graph, new boolean[Vertex]));
    }
}

/*Expected Output:

true

* */