package day39_graph;

import java.util.ArrayList;

public class Bellman_Ford_Algo {
    // Inner class to represent ek edge graph ke liye
    static class Edge {
        int src;  // Edge ka starting vertex
        int dest; // Edge ka ending vertex
        int wt;   // Edge ka weight (cost)

        // Constructor edge ko initialize karne ke liye
        public Edge(int s, int d, int w) {
            this.src = s;  // Source vertex set karna
            this.dest = d; // Destination vertex set karna
            this.wt = w;   // Weight assign karna
        }
    }

    // Graph banane ka function
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Har vertex ke liye ek empty ArrayList banate hain
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Graph me edges add karna
        // Format: graph[source].add(new Edge(source, destination, weight))
        graph[0].add(new Edge(0, 1, 2));  // Vertex 0 se vertex 1 tak edge, weight 2
        graph[0].add(new Edge(0, 2, 4));  // Vertex 0 se vertex 2 tak edge, weight 4

        graph[1].add(new Edge(1, 2, -4)); // Vertex 1 se vertex 2 tak edge, weight -4 (negative edge)

        graph[2].add(new Edge(2, 3, 2));  // Vertex 2 se vertex 3 tak edge, weight 2

        graph[3].add(new Edge(3, 4, 4));  // Vertex 3 se vertex 4 tak edge, weight 4

        graph[4].add(new Edge(4, 1, -1)); // Vertex 4 se vertex 1 tak edge, weight -1 (negative edge)
    }

    // Bellman-Ford algorithm ka implementation
    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // Distance array (source se har vertex tak distance)

        // Sabhi vertices ke liye distance infinity set karte hain
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE; // Infinity
        }
        dist[src] = 0; // Source vertex ka distance 0 set karte hain

        int V = graph.length; // Total number of vertices

        // Algorithm ka main loop (V-1 baar relaxation karna) O(V)
        for (int i = 0; i < V - 1; i++) { // O(V)
            // Sabhi edges ko check karte hain (Relaxation step)
            for (int j = 0; j < graph.length; j++) { // O(E)
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k); // Current edge ko access karte hain

                    // Relaxation condition: Agar new path kam distance provide kare
                    if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                        dist[e.dest] = dist[e.src] + e.wt; // Destination vertex ka distance update karte hain
                    }
                }
            }
        }

        // Negative weight cycle detection ke liye ek aur pass (V-th iteration)
        for (int j = 0; j < graph.length; j++) { // O(E)
            for (int k = 0; k < graph[j].size(); k++) {
                Edge e = graph[j].get(k); // Current edge ko access karte hain

                // Agar ab bhi distance update ho raha hai, toh negative weight cycle hai
                if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                    System.out.println("Graph me negative weight cycle hai.");
                    return; // Algorithm terminate kar dete hain
                }
            }
        }

        // Agar negative weight cycle nahi mila, toh shortest distances ko print karte hain
        System.out.println("Source vertex " + src + " se sabhi vertices takka shortest distance:");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Vertex " + i + ": " + (dist[i] == Integer.MAX_VALUE ? "Infinity" : dist[i]));
        }
    }

    public static void main(String[] args) {
        int V = 5; // Graph me vertices ki sankhya
        ArrayList<Edge> graph[] = new ArrayList[V]; // Graph ko adjacency list me represent karte hain
        createGraph(graph); // Graph banate hain
        int src = 0; // Source vertex jahan se Bellman-Ford algorithm shuru hoga
        bellmanFord(graph, src); // Bellman-Ford algorithm ka function call karte hain
    }
}
