package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

/**
 * Bridge in Graph (Tarjan’s Algorithm)
 * Bridge in Graph is a subgraph of Weighted Graph.
 * Bridge is an edge whose deletion increases the graph's number of connected components.
 * Using of Tarjan's Algorithm on Undirected Graph.
 * Discovery Time of U is less than the Lowest Discovery Time of V in DFS Traversal.
 */
public class BridgeInGraphTarjansAlgorithm {
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
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // for 1 -vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // for 2 -vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // for 3 -vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        // for 4 -vertex
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        // for 5 -vertex
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    // Parent => every previous node of currentNode in DFS Traversal.
    static void modifiedDFS(ArrayList<Edge>[] graph, int currentNode,
                            int parent, boolean[] visited, int[] discoveryTime,
                            int[] lowestDiscoveryTime, int timeTracker) {

        visited[currentNode] = true; // Initially mark the current node as visited.

        // Initially lowestDiscoveryTime[currentNode] = discoveryTime[currentNode];
        discoveryTime[currentNode] = lowestDiscoveryTime[currentNode] = ++timeTracker;
        // Discovery Time will be increased by 1 after visiting all its neighbors.
        // Lowest Discovery Time of all neighbors[including current node].

        // Loop for all neighbors of currentNode
        for (int i = 0; i < graph[currentNode].size(); i++) {

            Edge currentEdge = graph[currentNode].get(i);
            // Neighbor will be the currentEdge.Destination

            if (currentEdge.Destination == parent) // If the neighbor is a parent,
                continue; // Skip processing for the parent node.

            // When the current neighbor is visited, then update the lowestDiscoveryTime
            if (visited[currentEdge.Destination]) { // Bridge does not exist.
                // Then update lowestDiscoveryTime[currentNode].

                // Here, currentNode => currentEdge.Destination
                lowestDiscoveryTime[currentNode] = Math.min(lowestDiscoveryTime
                        [currentNode], discoveryTime[currentEdge.Destination]);

            } else { // If the neighbor is not visited yet.
                modifiedDFS(graph, currentEdge.Destination, currentNode, visited,
                        discoveryTime, lowestDiscoveryTime, timeTracker);

                // Update lowestDiscoveryTime[currentNode] with the minimum
                // using comparison after visiting all its neighbors.
                lowestDiscoveryTime[currentNode] = Math.min(lowestDiscoveryTime
                        [currentNode], lowestDiscoveryTime[currentEdge.Destination]);

                /* Find Bridge in Graph using Tarjan's Algorithm, when
                discoveryTime[currentNode] < lowestDiscoveryTime[currentEdge.Destination],
                then Bridge exists between currentNode and neighbor/currentEdge.Destination.*/
                if (discoveryTime[currentNode]
                        < lowestDiscoveryTime[currentEdge.Destination]) {

                    System.out.println("BRIDGE : " +
                            currentNode + "-----" + currentEdge.Destination);
                }
            }
        }
    }


    static void getBridge(ArrayList<Edge>[] graph, int Vertex) {
        int[] discoveryTime = new int[Vertex]; // For all vertices
        int[] lowestDiscoveryTime = new int[Vertex];
        boolean[] visited = new boolean[Vertex];
        int timeTracker = 0;

        // Loop to call modifiedDFS() For all vertices.
        for (int i = 0; i < Vertex; i++) {

            // If a vertex is not visited yet, then call dfs() function.
            if (!visited[i]) {

                // Here, Initially Parent => -1, because there is no previous
                // node of currentNode in DFS Traversal.
                modifiedDFS(graph, i, -1, visited,
                        discoveryTime, lowestDiscoveryTime, timeTracker);
            }
        }
    }

    public static void main(String[] args) {
        /*

        1-------- 0--------3    // For Dry Run
        |       /          |
        |     /            |
        |   /              |
        | /                |
        2                  4


        1------------0----------3\
        |          /            |  \
        |        /              |   \
        |      /                |     5
        |    /                  |    /
        |  /                    |  /
        2                       4/

        */

        int Vertex = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);
//        tarjanAlgo(graph);

        getBridge(graph, Vertex);
    }
}

/*Expected Output:

BRIDGE : 0-----3

* */