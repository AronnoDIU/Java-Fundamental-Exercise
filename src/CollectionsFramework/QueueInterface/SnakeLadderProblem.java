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
    int src, dest;

    public EdgeSLP(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

// A queue node
class NodeSLP {
    // stores number associated with graph node
    int ver;

    // `min_dist` stores the minimum distance of a node from the starting vertex
    int min_dist;

    public NodeSLP(int ver, int min_dist) {
        this.ver = ver;
        this.min_dist = min_dist;
    }
}

// A class to represent a graph object
class GraphNLP {
    // A list of lists to represent an adjacency list
    List<List<Integer>> adjList = null;

    // Constructor
    GraphNLP(List<EdgeSLP> edges, int n) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // add edges to the graph
        for (EdgeSLP edge : edges) {
            // Please note that the graph is directed
            adjList.get(edge.src).add(edge.dest);
        }
    }
}