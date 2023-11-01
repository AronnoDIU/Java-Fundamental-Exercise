package CollectionsFramework.GraphDataStructure;

/**
 * Topological Sort using BFS.
 * <p>
 * Kahn's algorithm.In-degree == Incoming Edges.Out-degree == Outgoing Edges.
 * A DAG is a Directed Acyclic Graph (DAG).
 * That means there is no cycle exists in a DAG.
 * If there is a cycle exists then Topological Sort is not possible.
 * If we find the longest path in a DAG, then it is called a Topological Sort.
 * And it has at least one starting vertex with in-degree 0
 * and at least one vertex with out-degree 0.(In general).
 * Fact: A DAG has at least one vertex with in-degree 0
 * and at least one vertex with out-degree 0.
 */
public class TopologicalSortBFS {
    public static void main(String[] args) {

    }
}
