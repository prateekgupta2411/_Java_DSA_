package day39_graph;

import java.util.ArrayList;

// Bellman-Ford algorithm implementation with fewer lines of code but same time complexity (O(V*E))
public class Bellaman_Ford_Algo_II {

    // Edge class to represent an edge in the graph
    static class Edge {
        int src;  // Source vertex of the edge
        int dest; // Destination vertex of the edge
        int wt;   // Weight of the edge

        // Constructor to initialize an edge
        public Edge(int s, int d, int w) {
            this.src = s;  // Set source vertex
            this.dest = d; // Set destination vertex
            this.wt = w;   // Set weight of the edge
        }
    }

    // Function to create the graph by adding edges to the graph list
    public static void createGraph(ArrayList<Edge> graph) {
        // Adding edges to the graph (source, destination, weight)
        graph.add(new Edge(0, 1, 2));  // Edge from vertex 0 to vertex 1 with weight 2
        graph.add(new Edge(0, 2, 4));  // Edge from vertex 0 to vertex 2 with weight 4
        graph.add(new Edge(1, 2, -4)); // Edge from vertex 1 to vertex 2 with weight -4 (negative weight)
        graph.add(new Edge(2, 3, 2));  // Edge from vertex 2 to vertex 3 with weight 2
        graph.add(new Edge(3, 4, 4));  // Edge from vertex 3 to vertex 4 with weight 4
        graph.add(new Edge(4, 1, -1)); // Edge from vertex 4 to vertex 1 with weight -1 (negative weight)
    }

    // Bellman-Ford algorithm implementation
    public static void bellmanFord(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];  // Array to store the shortest distances from source to all vertices
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;  // Initially, all distances are set to infinity
        }
        dist[src] = 0;  // The distance from the source to itself is 0

        // Main loop for relaxation (O(V) times)
        for (int i = 0; i < V - 1; i++) { // Repeat V-1 times
            // Loop through all the edges in the graph (O(E))
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j); // Get the current edge

                // Relaxation step: Check if the path through the current edge offers a shorter path
                if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                    dist[e.dest] = dist[e.src] + e.wt; // Update the shortest distance to the destination
                }
            }
        }

        // Print the shortest distance from source to all vertices
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " "); // Output the distance for each vertex
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices in the graph
        ArrayList<Edge> graph = new ArrayList<>(); // Create a graph represented as an ArrayList of edges
        createGraph(graph); // Call the createGraph function to populate the graph with edges
        int src = 0; // Source vertex from which to find the shortest path
        bellmanFord(graph, src, V); // Call the Bellman-Ford function to calculate the shortest paths
    }
}
