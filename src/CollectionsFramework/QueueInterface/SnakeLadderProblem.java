package CollectionsFramework.QueueInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * The idea is to consider the snake and ladders board as a directed graph and run
 * Breadth–first search (BFS) from the starting node, vertex 0, as per game rules.
 * We construct a directed graph, keeping in mind the following conditions:
 * <p>
 * 1. For any vertex in graph v, we have an edge from v to v+1, v+2, v+3, v+4, v+5,
 * v+6 as we can reach any of these nodes in one throw of dice from node v.
 * 2. If any of these neighbors of v has a ladder or snake,
 * which takes us to position x, then x becomes the neighbor instead of the
 * base of the ladder or head of the snake.
 * <p>
 * Now the problem is reduced to finding the shortest path between two nodes
 * in a directed graph problem.
 * We represent the snake and ladders board using a map.
 */
// Find the minimum number of throws required to win a given Snakes and Ladders board game.
public class SnakeLadderProblem {
    public static void main(String[] args) {

    }
}

// A class to store a graph edge
class EdgeSLP {
    int source, destination;

    public EdgeSLP(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }
}

// A Class of queue node
class NodeSLP {
    // stores number associated with graph node
    int vertex;

    // 'minimumDistance' Stores the minimum distance of a node from the starting vertex
    int minimumDistance;

    public NodeSLP(int vertex, int minimumDistance) {
        this.vertex = vertex;
        this.minimumDistance = minimumDistance;
    }
}

// A class to represent a graph object
class GraphNLP {
    // A list of lists to represent an adjacency list
    List<List<Integer>> adjacentList = null;

    // Constructor
    GraphNLP(List<EdgeSLP> edgeSLPList, int number) {
        adjacentList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            adjacentList.add(new ArrayList<>());
        }

        // add edgeSLPList to the graph
        for (EdgeSLP edge : edgeSLPList) {
            // Please note that the graph is directed
            adjacentList.get(edge.source).add(edge.destination);
        }
    }
}