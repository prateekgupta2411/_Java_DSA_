package day37_graph;

import java.util.ArrayList;

public class CycleDetection_DirectedGraph {
    static class Edge {
        int src;
        int dest;

        // Constructor for an edge from src to dest
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Method to create a graph with a cycle
    public static void createCycle(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // Initialize each adjacency list
        }

         // cycle detection // return true
        // Add directed edges to create a cycle
        graph[0].add(new Edge(0, 2)); // 0 → 2
        graph[1].add(new Edge(1, 0)); // 1 → 0
        graph[2].add(new Edge(2, 3)); // 2 → 3
        graph[3].add(new Edge(3, 0)); // 3 → 0 (back to 0 creates a cycle)

        //  no cycle // return false
//        graph[0].add(new Edge(0,1));
//        graph[0].add(new Edge(0,2));
//        graph[1].add(new Edge(1,3));
//        graph[2].add(new Edge(2,3));
    }
    // O(V+E)
    // Method to check if the directed graph contains a cycle
    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length]; // Tracks visited nodes
        boolean stack[] = new boolean[graph.length]; // Tracks nodes in the current recursive stack

        // Check for cycles in all components of the graph
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) { // If the node hasn't been visited yet
                if (isCycleUtil(graph, i, vis, stack)) { // Check for a cycle from this node
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle found
    }

    // Utility method for cycle detection using DFS
    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true; // Mark the current node as visited
        stack[curr] = true; // Add the current node to the recursion stack

        // Traverse all adjacent nodes
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i); // Get the edge to the adjacent node
            if (stack[e.dest] == true) { // If the adjacent node is in the recursion stack
                return true; // Cycle detected
            }
            else if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) { // If the adjacent node hasn't been visited
                return true; // Cycle detected in the recursive call
            }
        }

        stack[curr] = false; // Remove the current node from the recursion stack
        return false; // No cycle detected from the current node
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V]; // Graph represented as an adjacency list
        createCycle(graph); // Create the graph with a cycle
        System.out.println(isCycle(graph)); // Check if the graph contains a cycle
    }
}
