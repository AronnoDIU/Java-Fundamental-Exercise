package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// Articulation Point in Graph (Tarjan’s Algorithm)
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

    static void dfs(ArrayList<Edge> graph[], int curr, int par,
                    boolean vis[], int dt[], int low[], int time,
                    boolean isArticulation[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(e.Destination == par)
                continue;
            if(vis[e.Destination]) {
                low[curr] = Math.min(low[curr], dt[e.Destination]);
            } else {
                dfs(graph, e.Destination, curr, vis, dt, low, time, isArticulation);
                low[curr] = Math.min(low[curr], low[e.Destination]);
                if(dt[curr] <= low[e.Destination] && par != -1) {
                    isArticulation[curr] = true;
                }
                child++;
            }
        }
        if(par == -1 && child > 1) {
            isArticulation[curr] = true;
        }
    }

    static void getArticulation(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean isArticulation[] = new boolean[V];
        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time, isArticulation);
            }
        }
        for(int i=0; i<V; i++) {
            if(isArticulation[i]) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getArticulation(graph, V);
    }
}

/*Expected Output:

BRIDGE : 1---4

* */