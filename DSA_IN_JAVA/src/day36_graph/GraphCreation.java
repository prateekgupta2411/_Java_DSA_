package day36_graph;

import java.util.ArrayList;

public class GraphCreation {
    // Inner class to represent an edge in the graph
    static class Edge {
        int src;  // Source vertex
        int dest; // Destination vertex
        int wt;   // Weight of the edge

        // Constructor to initialize an edge
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices in the graph
        // Array of ArrayLists to represent the graph
        ArrayList<Edge>[] graph = new ArrayList[V]; // null  -> empty ArrayList

        // Initialize each index of the graph array with an empty ArrayList
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));

        //1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 vertex
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));

        // Retrieve and display the neighbors of vertex 2
        System.out.println("Neighbors of vertex 2:");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i); // Get the edge at index i in vertex 2's adjacency list
            System.out.println("Destination: " + e.dest); // Print the destination vertex
        }
    }
}
