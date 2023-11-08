package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// Bridge in Graph (Tarjan’s Algorithm)
// Bridge in Graph is a subgraph of Weighted Graph.
// Bridge is an edge whose deletion increases the graph's number of connected components.
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
    }

    static void dfs(ArrayList<Edge>[] graph, int currentNode, int parent, boolean[] visited,
                    int[] discoveryTime, int[] lowestDiscoveryTime, int timeTracker) {

        visited[currentNode] = true; // Initially mark the current node as visited.
        discoveryTime[currentNode] = lowestDiscoveryTime[currentNode] = ++timeTracker;
        // Discovery Time will be increased by 1 after visiting all its neighbors.
        // Lowest Discovery Time of all neighbors[including current node].

        for (int i = 0; i < graph[currentNode].size(); i++) {

            Edge currentEdge = graph[currentNode].get(i);
            // Neighbor will be the currentEdge.Destination

            if (currentEdge.Destination == parent)
                continue; // Skip the parent.
            if (visited[currentEdge.Destination]) {

                // Here, currentNode => currentEdge.Destination
                lowestDiscoveryTime[currentNode] = Math.min(lowestDiscoveryTime
                        [currentNode], discoveryTime[currentEdge.Destination]);

            } else {
                dfs(graph, currentEdge.Destination, currentNode, visited,
                        discoveryTime, lowestDiscoveryTime, timeTracker);

                lowestDiscoveryTime[currentNode] = Math.min(lowestDiscoveryTime
                        [currentNode], lowestDiscoveryTime[currentEdge.Destination]);

                if (discoveryTime[currentNode] <
                        lowestDiscoveryTime[currentEdge.Destination]) {

                    System.out.println("BRIDGE : " + currentNode + "---" +
                            currentEdge.Destination);
                }
            }
        }
    }


    static void getBridge(ArrayList<Edge>[] graph, int Vertex) {
        int[] discoveryTime = new int[Vertex];
        int[] lowestDiscoveryTime = new int[Vertex];
        int time = 0;
        boolean[] visited = new boolean[Vertex];

        for (int i = 0; i < Vertex; i++) {

            // If a vertex is not visited yet, then call dfs() function.
            if (!visited[i]) {
                dfs(graph, i, -1, visited, discoveryTime, lowestDiscoveryTime, time);
            }
        }
    }

//    static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr) {
//        vis[curr] = true;
//        System.out.print(curr+" ");
//        for(int i=0; i<graph[curr].size(); i++) {
//            Edge e = graph[curr].get(i);
//            if(!vis[e.Destination]) {
//                dfs(graph, vis, e.Destination);
//            }
//        }
//    }

    //    static void tarjanAlgo(ArrayList<Edge>[] graph) {
//        boolean[] visited = new boolean[graph.length];
//        for (int i = 0; i < graph.length; i++) {
//            if(!visited[i]) {
//                dfs(graph, visited, i);
//            }
//        }
//    }
    public static void main(String[] args) {
        /*

        1-------- 0--------3
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

        int Vertex = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);
//        tarjanAlgo(graph);

        getBridge(graph, Vertex);
    }
}

/*Expected Output:

BRIDGE : 1---4

* */