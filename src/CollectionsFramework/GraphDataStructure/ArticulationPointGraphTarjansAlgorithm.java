package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

/**
 * Articulation Point in Graph (Tarjan’s Algorithm)
 * A vertex in an undirected connected graph is an articulation point(or cut vertex)
 * if removing it (and edges through it) disconnects the graph.
 */
/* Ancestor => a Node A that was discovered before the current Node in the DFS Traversal,
 is called the ancestor of the current Node.
 Ancestor => Every previous node of currentNode in DFS Traversal.
 Find Ancestor of currentNode using DFS Traversal through Discovery Time.
 So, Discovery Time indicates which node was visited first by DT value.*/
public class ArticulationPointGraphTarjansAlgorithm {
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
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        // for 2 -vertex
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        // for 3 -vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // for 4 -vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
    }

    static void dfs(ArrayList<Edge>[] graph, int currentNode,
                    int Parent, boolean[] visited, int[] discoveryTime,
                    int[] lowestDiscoveryTime, int timeTracker, boolean[] isArticulation) {

        visited[currentNode] = true; // Initially mark the current node as visited.

        // Initially lowestDiscoveryTime[currentNode] = discoveryTime[currentNode];
        discoveryTime[currentNode] = lowestDiscoveryTime[currentNode] = ++timeTracker;

        int child = 0; // Count the Number of children of currentNode.

        // Parent => every previous node of currentNode in DFS Traversal.
        for (int i = 0; i < graph[currentNode].size(); i++) {

            Edge currentEdge = graph[currentNode].get(i);
            // Neighbor will be the currentEdge.Destination

            if (currentEdge.Destination == Parent) // If the neighbor is a parent,
                continue; // Skip it.

            // If the neighbor is visited already, then update the lowestDiscoveryTime.
            if (visited[currentEdge.Destination]) {

                lowestDiscoveryTime[currentNode] = Math.min(lowestDiscoveryTime
                        [currentNode], discoveryTime[currentEdge.Destination]);

            } else { // If the neighbor is not visited yet.

                dfs(graph, currentEdge.Destination, currentNode, visited,
                        discoveryTime, lowestDiscoveryTime, timeTracker, isArticulation);

                lowestDiscoveryTime[currentNode] = Math.min(lowestDiscoveryTime
                        [currentNode], lowestDiscoveryTime[currentEdge.Destination]);

                if (discoveryTime[currentNode] <= lowestDiscoveryTime
                        [currentEdge.Destination] && Parent != -1) {

                    isArticulation[currentNode] = true;
                }
                child++; // Increment the number of children of currentNode.
            }
        }

        // If the currentNode is root and has more than 1 child.
        if (Parent == -1 && child > 1) {
            isArticulation[currentNode] = true;
        }
    }

    static void getArticulation(ArrayList<Edge>[] graph, int Vertex) {
        int[] discoveryTime = new int[Vertex];
        int[] lowestDiscoveryTime = new int[Vertex];
        boolean[] visited = new boolean[Vertex];
        boolean[] isArticulation = new boolean[Vertex];
        int timeTracker = 0;

        for (int i = 0; i < Vertex; i++) {

            // If the vertex is not visited yet, then call dfs() function.
            if (!visited[i]) {

                dfs(graph, i, -1, visited, discoveryTime,
                        lowestDiscoveryTime, timeTracker, isArticulation);
            }
        }
        for (int i = 0; i < Vertex; i++) {
            if (isArticulation[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        /*
                  1-------- 0--------3
                  |       /          |
                  |     /            |
                  |   /              |
                  | /                |
                  2                  4
        */

        int Vertex = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);
        getArticulation(graph, Vertex);
    }
}

/*Expected Output:

BRIDGE : 1---4

* */