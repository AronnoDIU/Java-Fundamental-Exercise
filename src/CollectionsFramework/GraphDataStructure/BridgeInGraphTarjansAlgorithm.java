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

    static void dfs(ArrayList<Edge>[] graph, int curr, int par, boolean[] vis, int[]
            dt, int[] low, int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(e.Destination == par)
                continue;
            if(vis[e.Destination]) {
                low[curr] = Math.min(low[curr], dt[e.Destination]);
            } else {
                dfs(graph, e.Destination, curr, vis, dt, low, time);
                low[curr] = Math.min(low[curr], low[e.Destination]);
                if(dt[curr] < low[e.Destination]) {
                    System.out.println("BRIDGE : " + curr + "---" + e.Destination);
                }
            }
        }
    }


    static void getBridge(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V];
        int[] low = new int[V];
        int time = 0;
        boolean[] vis = new boolean[V];
        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time);
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

BRIDGE : 1---4

* */