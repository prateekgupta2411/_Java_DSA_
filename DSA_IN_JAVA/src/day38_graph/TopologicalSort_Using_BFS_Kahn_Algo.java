package day38_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort_Using_BFS_Kahn_Algo {

    // Class to represent an edge in the graph
    static class Edge {
        int src;  // Source vertex
        int dest; // Destination vertex

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create a directed graph with edges
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize adjacency list for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graph[2].add(new Edge(2, 3)); // Edge from vertex 2 to 3
        graph[3].add(new Edge(3, 1)); // Edge from vertex 3 to 1
        graph[4].add(new Edge(4, 0)); // Edge from vertex 4 to 0
        graph[4].add(new Edge(4, 1)); // Edge from vertex 4 to 1
        graph[5].add(new Edge(5, 0)); // Edge from vertex 5 to 0
        graph[5].add(new Edge(5, 2)); // Edge from vertex 5 to 2
    }

    // Method to calculate the in-degree (number of incoming edges) for each vertex
    public static void calIndeg(ArrayList<Edge> graph[], int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i; // Current vertex
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j); // Get each edge from the adjacency list
                indeg[e.dest]++; // Increment in-degree for the destination vertex
            }
        }
    }

    // Method to perform Topological Sort using BFS (Kahn's Algorithm)
    public static void topSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length]; // Array to store in-degrees of all vertices

        // Calculate in-degrees for all vertices
        calIndeg(graph, indeg);

        // Queue to store vertices with 0 in-degree
        Queue<Integer> q = new LinkedList<>();

        // Add all vertices with 0 in-degree to the queue
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        // Perform BFS to process all vertices
        while (!q.isEmpty()) { // Process until the queue becomes empty
            int curr = q.remove(); // Remove the front vertex from the queue
            System.out.print(curr + " "); // Print the current vertex (topological order)

            // Iterate through all outgoing edges of the current vertex
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i); // Get the edge
                indeg[e.dest]--; // Decrement in-degree of the destination vertex

                // If in-degree of destination vertex becomes 0, add it to the queue
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println(); // Move to the next line after printing all vertices
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices in the graph
        ArrayList<Edge> graph[] = new ArrayList[V]; // Create an adjacency list
        createGraph(graph); // Build the graph with edges
        topSort(graph); // Perform topological sorting
    }
}
