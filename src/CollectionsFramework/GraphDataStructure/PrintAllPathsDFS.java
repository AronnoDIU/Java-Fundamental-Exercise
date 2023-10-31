package CollectionsFramework.GraphDataStructure;

import java.util.ArrayList;

/**
 * Print all paths from Source to Destination.
 * For a given source and destination, if there is a path exists from source to destination.
 * Using Depth-First Search ==> Keep going to the first neighbors.
 */
public class PrintAllPathsDFS {
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

        // for 1 -vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // for 2 -vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // for 3 -vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        // for 4 -vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        // for 5 -vertex
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        // for 6 -vertex
        graph[6].add(new Edge(6, 5));
    }

    static void printAllPaths(ArrayList<Edge>[] graph, int Source, int Destination,
                              String Paths, boolean[] visited) {

        if (Source == Destination) { // Base Case.
            System.out.println(Paths);
            return;
        }

        // If Source is not visited.
        for (int i = 0; i < graph[Source].size(); i++) {
            Edge currentEdge = graph[Source].get(i);

            // currentEdge.Destination = neighbor.
            if (!visited[currentEdge.Destination]) {

                /* Before traveling through the Recursive call,
                 First Mark currentElement as visited.*/
                visited[currentEdge.Destination] = true;

                printAllPaths(graph, currentEdge.Destination, Destination,
                        Paths + " -> " + currentEdge.Destination, visited);

                /* After traveling through the Recursive call,
                 In Backtracking, Unmark currentElement as visited.
                 So that it will not be shown as visited again.
                 But it will be used in the next Recursive call.
                 For printing all possible paths.*/
                visited[currentEdge.Destination] = false;

                /* [N.B.] -> If currentElement is not tracked as visited or not
                Visited in Backtracking, Then it will be creating unlimited loop.*/
            }
        }
    }

    public static void main(String[] args) {
        /*

              1 ---- 3
           /          |   \
          0           |      5 --- 6
           \          |   /
              2 ---- 4
            */

        int Vertex = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[Vertex];
        createGraph(graph);

        int Source = 0;
        int Destination = 5;
        boolean[] visited = new boolean[Vertex];

        visited[Source] = true;

        printAllPaths(graph, Source, Destination, "" + Source, visited);
    }
}

/*Expected Output:

0 -> 1 -> 3 -> 4 -> 5
0 -> 1 -> 3 -> 5
0 -> 2 -> 4 -> 3 -> 5
0 -> 2 -> 4 -> 5

* */