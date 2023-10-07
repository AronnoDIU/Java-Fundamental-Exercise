package CollectionsFramework.QueueInterface;

import java.util.*;

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
    // Perform BFS on graph `graphSLP` starting from a given source vertex
    static int BFS(GraphSLP graphSLP, int number) {
        // create a queue for doing BFS
        Queue<NodeSLP> nodeSLPArrayDeque = new ArrayDeque<>();

        // to keep track of whether a vertex is discovered or not
        boolean[] discovered = new boolean[number + 1];

        // mark the source vertex as discovered
        discovered[0] = true;

        // assign the minimum distance of the source vertex as 0 and
        // enqueue it
        NodeSLP nodeSLP = new NodeSLP(0, 0);
        nodeSLPArrayDeque.add(nodeSLP);

        // loop till queue is empty
        while (!nodeSLPArrayDeque.isEmpty()) {
            // dequeue front nodeSLP
            nodeSLP = nodeSLPArrayDeque.poll();

            // Stop BFS if the last nodeSLP is reached
            if (nodeSLP.vertex == number) {
                return nodeSLP.minimumDistance;
            }

            // do for every adjacent nodeSLP of the current nodeSLP
            for (int EnhancedGraph : graphSLP.adjacentList.get(nodeSLP.vertex)) {
                if (!discovered[EnhancedGraph]) {
                    // mark it as discovered and enqueue it
                    discovered[EnhancedGraph] = true;

                    // assign the minimum distance of the current nodeSLP
                    // one more than the minimum distance of the parent nodeSLP
                    nodeSLPArrayDeque.add(new NodeSLP
                            (EnhancedGraph, nodeSLP.minimumDistance + 1));
                }
            }
        }

        return -1;
    }

    public static int
    findMinimumMoves(Map<Integer, Integer> ladder, Map<Integer, Integer> snake) {
        // total number of nodes in the graph
        int number = 10 * 10;

        // find all edges involved and store them in a list
        List<EdgeSLP> edges = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= 6 && i + j <= number; j++) {

                // update destination if there is any ladder
                // or snake from the current position.
                int destination;

                int _ladder = (ladder.get(i + j) != null) ? ladder.get(i + j) : 0;
                int _snake = (snake.get(i + j) != null) ? snake.get(i + j) : 0;

                if (_ladder != 0 || _snake != 0) {
                    destination = _ladder + _snake;
                } else {
                    destination = i + j;
                }

                // add an edge from src to destination
                edges.add(new EdgeSLP(i, destination));
            }
        }

        // construct a directed graph
        GraphSLP graphSLP = new GraphSLP(edges, number);

        // Find the shortest path between 1 and 100 using BFS
        return BFS(graphSLP, number);
    }

    public static void main(String[] args) {
        // snakes and ladders are represented using a map.
        Map<Integer, Integer> ladder = new HashMap<>();
        Map<Integer, Integer> snake = new HashMap<>();

        // insert ladders into the map
        ladder.put(1, 38);
        ladder.put(4, 14);
        ladder.put(9, 31);
        ladder.put(21, 42);
        ladder.put(28, 84);
        ladder.put(51, 67);
        ladder.put(72, 91);
        ladder.put(80, 99);

        // insert snakes into the map
        snake.put(17, 7);
        snake.put(54, 34);
        snake.put(62, 19);
        snake.put(64, 60);
        snake.put(87, 36);
        snake.put(93, 73);
        snake.put(95, 75);
        snake.put(98, 79);

        System.out.println(findMinimumMoves(ladder, snake));
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
class GraphSLP {
    // A list of lists to represent an adjacency list
    List<List<Integer>> adjacentList;

    // Constructor
    GraphSLP(List<EdgeSLP> edgeSLPList, int number) {
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

/*Expected Output:

7

* */