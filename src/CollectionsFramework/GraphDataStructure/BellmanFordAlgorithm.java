package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// Bellman Ford Algorithm (Shortest Distance)
public class BellmanFordAlgorithm {
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

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // for 0 -vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // for 1 -vertex
        graph[1].add(new Edge(1, 2, -4));

        // for 2 -vertex
        graph[2].add(new Edge(2, 3, 2));

        // for 3 -vertex
        graph[3].add(new Edge(3, 4, 4));

        // for 4 -vertex
        graph[4].add(new Edge(4, 1, -1));
    }

    static void bellmanFord(ArrayList<Edge>[] graph, int Source) {
        int[] Destination = new int[graph.length];
        for (int i = 0; i < Destination.length; i++) {
            if (i != Source)
                Destination[i] = Integer.MAX_VALUE;
        }
//O(V)
        for (int i = 0; i < graph.length - 1; i++) {
//edges - O(E)
            for (ArrayList<Edge> edges : graph) {
                for (Edge e : edges) {
                    int u = e.Source;
                    int v = e.Destination;
                    int wt = e.Weight;
                    if (Destination[u] != Integer.MAX_VALUE
                            && Destination[u] + wt < Destination[v]) {

                        Destination[v] = Destination[u] + wt;
                    }
                }
            }
        }
//Detecting Negative Weight Cycle
        for (ArrayList<Edge> edges : graph) {
            for (Edge e : edges) {
                int u = e.Source;
                int v = e.Destination;
                int wt = e.Weight;
                if (Destination[u] != Integer.MAX_VALUE && Destination[u] + wt < Destination[v]) {
                    System.out.println("negative weight cycle exists");
                    break;
                }
            }
        }
        for (int j : Destination) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
