package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// Cycle Detection (Undirected Graph)
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

    static boolean isCyclicUtil(ArrayList<Edge>[] graph, boolean[] visited, int
            currentNode, int pair) {
        visited[currentNode] = true;
        for (int i = 0; i < graph[currentNode].size(); i++) {
            Edge currentEdge = graph[currentNode].get(i);
            //case1
            if (visited[currentEdge.Destination] && currentEdge.Destination != pair) {
                boolean isCycle = isCyclicUtil(graph, visited, currentEdge.Destination, currentNode);
                if (isCycle)
                    return true;
            }
//            else if (currentEdge.Destination == pair) {
//                //case 2
//                continue;
//            }
            else {
                //case 3
                return true;
            }
        }
        return false;
    }

    // Time Complexity = O(V+E)
    static boolean isCyclic(ArrayList<Edge>[] graph, boolean[] visited) {
        for (int i = 0; i < graph.length; i++) {
            if (isCyclicUtil(graph, visited, i, -1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
             0 -------  3
           / |          |
          /  |          |
        1    |          4
          \  |
           \ |
             2
        */
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCyclic(graph, new boolean[V]));
    }
}

/*Expected Output:

true

* */