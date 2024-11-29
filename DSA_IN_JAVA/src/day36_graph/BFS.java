package day36_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    // Define the structure of an Edge in the graph
    static class Edge {
        int src; // Source vertex
        int dest; // Destination vertex
        int wt; // Weight of the edge

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Method to create a graph using an adjacency list
    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize the adjacency list for all vertices
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 3, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // Print the neighbors of a specific vertex
    public static void printNeighbour(ArrayList<Edge>[] graph) {
        // Iterate through the adjacency list of vertex 2
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " " + e.wt); // Print destination and weight of each edge
        }
    }

    // Breadth-First Search (BFS) traversal of the graph
    public static void bfs(ArrayList<Edge>[] graph) { // Time complexity: O(V + E)
        Queue<Integer> q = new LinkedList<>(); // Queue for BFS
        boolean vis[] = new boolean[graph.length]; // Visited array to track visited vertices
        q.add(0); // Start BFS from vertex 1

        while (!q.isEmpty()) {
            int curr = q.remove(); // Dequeue a vertex

            // If the vertex is not visited
            if (!vis[curr]) {
                System.out.print(curr + " "); // Visit the current vertex
                vis[curr] = true;

                // Add all unvisited neighbors to the queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7; // Number of vertices in the graph
        ArrayList<Edge>[] graph = new ArrayList[V]; // Create adjacency list
        createGraph(graph); // Build the graph
        bfs(graph); // Perform BFS traversal
    }
}
