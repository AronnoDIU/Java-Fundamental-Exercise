package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

// Cycle Detection (Directed Graph) using Modified Depth-First Search.
public class CycleDetectionDG {
    static class Edge {
        int Source;
        int Destination;

        public Edge(int source, int destination) {
            Source = source;
            Destination = destination;
        }
    }

    //graph1 - true
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // for 0 -vertex
        graph[0].add(new Edge(0, 2));

        // for 1 -vertex
        graph[1].add(new Edge(1, 0));

        // for 2 -vertex
        graph[2].add(new Edge(2, 3));

        // for 3 -vertex
        graph[3].add(new Edge(3, 0));
    }

    // Graph2 - return false
//    static void createGraph2(ArrayList<Edge>[] graph) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        // for 0 -vertex
//        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
//
//        // for 1 -vertex
//        graph[1].add(new Edge(1, 3));
//
//        // for 2 -vertex
//        graph[2].add(new Edge(2, 3));
//    }

    static boolean isCyclicUtil(ArrayList<Edge>[] graph,
                                int currentNode, boolean[] visited, boolean[] recursionStack) {

        visited[currentNode] = true; // Initially mark the current node as visited.

        recursionStack[currentNode] = true; // Eventually mark the recursionStack as true.

        for (int i = 0; i < graph[currentNode].size(); i++) {

            Edge currentEdge = graph[currentNode].get(i); // get the Edge.
            // Neighbor will be the currentEdge.Destination

            /* If the neighbor exists in recursionStack.
             Then return true because there is a cycle.*/
            if (recursionStack[currentEdge.Destination]) {
                return true; // Cycle exists
            } else if (!visited[currentEdge.Destination] &&
                    isCyclicUtil(graph, currentEdge.Destination, visited, recursionStack)) {

                return true; // Cycle exists
            }
        }
        // remove the current node from the recursionStack in time of Backtracking.
        recursionStack[currentNode] = false;
        return false; // No cycle exists.
    }

    // Time Complexity = O(V + E)
    static boolean isCyclicDirected(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {

            if (!visited[i]) { // if the current node is not visited

                // Mark the current node as visited & call isCyclicUtil for the current node.
                boolean cycle = isCyclicUtil(graph, i, visited, new boolean[visited.length]);

                if (cycle) { // Cycle exists
                    return true;
                }
            }
        }
        return false; // No cycle exists
    }

    public static void main(String[] args) {
        /*

          1 ---- > 0<-------|
                   |        3
                   |        /^
                   |       /
                  >|      /
                   2-----
        * */

        int Vertex = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);
        System.out.println(isCyclicDirected(graph));
    }
}

/*Expected Output:

true

* */