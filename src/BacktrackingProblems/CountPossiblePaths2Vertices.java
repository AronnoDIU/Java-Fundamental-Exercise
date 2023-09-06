package BacktrackingProblems;

import java.util.LinkedList;

/*Count the total number of ways or paths that exist between two vertices in a
directed graph. These paths don’t contain a cycle, the simple enough reason is
that a cycle contains an infinite number of paths and hence they create a problem*/

/*    For the following Graph:

              >     B
             /       |    \
            /        |      \
           /         |        \->
         A-----------|---------> E
          \          |  /------>
           \        /|
            \   /    |_________>
            > C <---------------D


    Input: Count paths between A and E
    Output: Total paths between A and E are 4
    Explanation: The 4 paths between A and E are:

                          A -> E
                          A -> B -> E
                          A -> C -> E
                          A -> B -> D -> C -> E

    Input: Count paths between A and C
    Output: Total paths between A and C are 2
    Explanation: The 2 paths between A and C are:

                          A -> C
                          A -> B -> D -> C*/

// Java program to count all paths from a source to a destination


// This class represents a directed graph using adjacency list representation
public class CountPossiblePaths2Vertices {

    // Array of lists for Adjacency List Representation
    private final LinkedList<Integer>[] Adjacency;

    @SuppressWarnings("unchecked") CountPossiblePaths2Vertices(int verticesNumber)
    {
        // Number of vertices
        Adjacency = new LinkedList[verticesNumber];
        for (int i = 0; i < verticesNumber; ++i)
            Adjacency[i] = new LinkedList<>();
    }

    // Method to add an edge into the graph
    void addEdge(int v, int w)
    {

        // Add w to v's list.
        Adjacency[v].add(w);
    }

    // A recursive method to count all paths from 'currentVertex' to 'destinationVertex'.
    int countPathsUtil(int currentVertex, int destinationVertex, int pathCount)
    {

        // If current vertex is same as destination, then increment Path Count
        if (currentVertex == destinationVertex) {
            pathCount++;
        }

        // Recursion for all the vertices adjacent to this vertex
        else {
            for (int vertices : Adjacency[currentVertex]) {
                pathCount = countPathsUtil(vertices, destinationVertex, pathCount);
            }
        }
        return pathCount;
    }

    // Returns count of paths from 'sourceVertex' to 'destinationVertex'
    int countPaths(int sourceVertex, int destinationVertex)
    {

        // Call the recursive method to count all paths
        int pathCount = 0;
        pathCount = countPathsUtil(sourceVertex, destinationVertex, pathCount);
        return pathCount;
    }
    public static void main(String[] args) {
        CountPossiblePaths2Vertices vertices = new CountPossiblePaths2Vertices(5);
        vertices.addEdge(0, 1);
        vertices.addEdge(0, 2);
        vertices.addEdge(0, 3);
        vertices.addEdge(1, 3);
        vertices.addEdge(2, 3);
        vertices.addEdge(1, 4);
        vertices.addEdge(2, 4);

        int sourceVertex = 0, destinationVertex = 3;

        // Function call
        System.out.println(vertices.countPaths(sourceVertex, destinationVertex));
    }
}

/*Expected Output::

3

* */