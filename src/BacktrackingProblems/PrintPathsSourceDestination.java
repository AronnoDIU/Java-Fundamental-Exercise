package BacktrackingProblems;

import java.util.ArrayList;
import java.util.List;

// Print all paths from a given source to a destination

/*Given a directed graph, a source vertex ‘s’ and a destination
vertex ‘d,’ print all paths from given ‘s’ to ‘d.’

Approach:

    The idea is to do Depth First Traversal of a given directed graph.
    Start the DFS traversal from the source.
    Keep storing the visited vertices in an array or HashMap say ‘path[]’.
    If the destination vertex is reached, print the contents of path[].
    The important thing is to mark current vertices in the path[] as
visited also so that the traversal doesn’t go in a cycle.*/

// A directed graph using adjacency list representation.
public class PrintPathsSourceDestination {
    // No. of vertices in graph
    private final int vertices;

    private ArrayList<Integer>[] adjacentList;

    public PrintPathsSourceDestination(int vertices) {

        // initialize vertex count
        this.vertices = vertices;

        initializeAdjacentList();
    }

    // utility method to initialize an adjacency list
    @SuppressWarnings("unchecked")
    private void initializeAdjacentList() {
        adjacentList = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacentList[i] = new ArrayList<>();
        }
    }

    // add edge from u to v
    public void addEdge(int u, int v) {
        // Add v to u's list.
        adjacentList[u].add(v);
    }

    // Prints all paths from 'arbitrarySource' to 'arbitraryDestination'
    public void printAllPaths(int arbitrarySource, int arbitraryDestination) {
        boolean[] isVisited = new boolean[vertices];
        ArrayList<Integer> pathList = new ArrayList<>();

        // add a source to a path[]
        pathList.add(arbitrarySource);

        // Call recursive utility
        printAllPathsUtil(arbitrarySource, arbitraryDestination, isVisited, pathList);
    }

    /*A recursive function to print all paths from 'u' to 'd'.
      isVisited[] keeps track of vertices in a current path.
      localPathList<> stores actual vertices in the current path */
    private void
    printAllPathsUtil(Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList) {

        if (u.equals(d)) {
            System.out.println(localPathList);
            // if match found then no need to traverse more till depth
            return;
        }

        // Mark the current node
        isVisited[u] = true;

        // Recur for all the vertices
        // adjacent to the current vertex
        for (Integer i : adjacentList[u]) {
            if (!isVisited[i]) {
                // store current node in a path[]
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList);

                // remove current node in a path[]
                localPathList.remove(i);
            }
        }

        // Mark the current node
        isVisited[u] = false;
    }

    public static void main(String[] args) {

        PrintPathsSourceDestination sourceDestination = new PrintPathsSourceDestination(4);
        sourceDestination.addEdge(0, 1);
        sourceDestination.addEdge(0, 2);
        sourceDestination.addEdge(0, 3);
        sourceDestination.addEdge(2, 0);
        sourceDestination.addEdge(2, 1);
        sourceDestination.addEdge(1, 3);

        int arbitrarySource = 2;

        int arbitraryDestination = 3;

        System.out.println("Following are all different paths from "
                + arbitrarySource + " to " + arbitraryDestination);

        sourceDestination.printAllPaths(arbitrarySource, arbitraryDestination);
    }
}

/*Expected Output::

Following are all different paths from 2 to 3
[2, 0, 1, 3]
[2, 0, 3]
[2, 1, 3]

* */