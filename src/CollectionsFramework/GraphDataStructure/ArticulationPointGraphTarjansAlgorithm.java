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
 So, Discovery Time indicates which node was visited first by DT value.

 If Discovery Time is less than the current Node,
 then it is an articulation point or cut vertex of the current Node.

 Lowest Discovery Time => All possible reachable nodes from the current Node.

 [Backedge => A backedge is an edge that is not an articulation point.
 Someone has visited the child of the current Node before the current Node.]

 Child => A node that is not visited yet in DFS Traversal.
 */
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

        // for 4 -vertex
        graph[4].add(new Edge(4, 3));
    }

    // Time Complexity of Tarjan's Algorithm = O(V+E)
    static void modifiedDFS(ArrayList<Edge>[] graph,
                            int currentNode, int Parent, boolean[] visited,
                            int[] discoveryTime, int[] lowestDiscoveryTime,
                            int timeTracker, boolean[] isArticulation) {

        visited[currentNode] = true; // Initially mark the current node as visited.

        // Initially lowestDiscoveryTime[currentNode] = discoveryTime[currentNode];
        discoveryTime[currentNode] = lowestDiscoveryTime[currentNode] = ++timeTracker;

        int children = 0; // Count the Number of children of currentNode for Tracking.

        // Loop for all neighbors of currentNode
        for (int i = 0; i < graph[currentNode].size(); i++) {

            Edge currentEdge = graph[currentNode].get(i);
            // Neighbor will be the currentEdge.Destination

            // Case 1: If the neighbor is the parent, then skip it.
            // Parent => every previous node of currentNode in DFS Traversal.
            if (currentEdge.Destination == Parent)
                continue; // Skip it & process the next neighbor.

            // Case 2: If the neighbor is visited then Articulation Point not possible.
            /* [Backedge => A backedge is an edge that is not an articulation point.
             Someone has visited the child of the current Node before the current Node.]*/
            if (visited[currentEdge.Destination]) {
                // This is an Ancestor of currentNode. Not a child.

                // Compare & Update the lowestDiscoveryTime[currentNode].
                lowestDiscoveryTime[currentNode] = Math.min(lowestDiscoveryTime
                        [currentNode], discoveryTime[currentEdge.Destination]);

            }

            // Case 3: If the neighbor is not visited. This is a child of currentNode.
            else { // Articulation Point might be possible.

                // visited first through DFS Traversal.
                modifiedDFS(graph, currentEdge.Destination, currentNode, visited,
                        discoveryTime, lowestDiscoveryTime, timeTracker, isArticulation);

                // Compare & Update the lowestDiscoveryTime[currentNode].
                lowestDiscoveryTime[currentNode] = Math.min(lowestDiscoveryTime
                        [currentNode], lowestDiscoveryTime[currentEdge.Destination]);

                // Find Articulation Point through Discovery Time using Tarjan's Algorithm.
                if (discoveryTime[currentNode] <=
                        lowestDiscoveryTime[currentEdge.Destination] && Parent != -1) {

                    // Update as CurrentNode is an Articulation Point.
                    isArticulation[currentNode] = true;
                }
                children++; // Increment the number of children of currentNode.
            }
        }

        // Case 4: If the currentNode is a root/parent/first node/Starting Node
        // of DFS Traversal and has more than 1 child.
        if (Parent == -1 && children > 1) { // Articulation Point or Cut Vertex.
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

                // visited first through DFS Traversal.
                modifiedDFS(graph, i, -1, visited, discoveryTime,
                        lowestDiscoveryTime, timeTracker, isArticulation);
            }
        }

        // Print the Articulation Points.
        for (int i = 0; i < Vertex; i++) {
            if (isArticulation[i]) {
                System.out.println("Articulation Points : " + i);
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

Articulation Points : 0
Articulation Points : 3

* */