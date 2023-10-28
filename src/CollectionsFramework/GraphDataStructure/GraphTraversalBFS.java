package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Graph Traversal using Breadth First Search
public class GraphTraversalBFS {
    static class Edge {
        int Source;
        int Destination;
        int Weight;

        public Edge(int Source, int Destination, int Weight) {
            this.Source = Source;
            this.Destination = Destination;
            this.Weight = Weight;
        }
    }

    // Array of ArrayList<Edge> ==> Adjacency List/ List of Lists
    static void createGraph(ArrayList<Edge>[] graph) {  // Adjacency List
        for (int index = 0; index < graph.length; index++) {
            graph[index] = new ArrayList<>();
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


        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(6, 5, 1));
    }

    static void BFS(ArrayList<Edge>[] graph, int Vertex) {
        boolean[] visited = new boolean[Vertex];
        Queue<Integer> list = new LinkedList<>();
        list.add(0); //Source = 0
        while (!list.isEmpty()) {
            int curr = list.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    list.add(e.Destination);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
            1 --- 3
            / | \
            0 | 5 -- 6
            \ | /
            2 ---- 4
            */
        int Vertex = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);
        BFS(graph, Vertex);
    }
}

/*Expected Output:

0 1 2 3 4 5 6

* */