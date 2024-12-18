package day38_graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra_Algo {
    // Inner class to represent ek edge graph ke liye
    static class Edge {
        int src;  // Edge ka starting vertex
        int dest; // Edge ka ending vertex
        int wt;   // Edge ka weight (cost)

        // Constructor edge ko initialize karne ke liye
        Edge(int s, int d, int w) {
            this.src = s;  // Source vertex set karna
            this.dest = d; // Destination vertex set karna
            this.wt = w;   // Weight assign karna
        }
    }

    // Graph banane ka function
    // Graph ko adjacency list ke roop me represent karte hain
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Har vertex ke liye ek empty ArrayList banate hain
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Graph me edges add karna
        // Format: graph[source].add(new Edge(source, destination, weight))
        graph[0].add(new Edge(0, 1, 2)); // Vertex 0 se vertex 1 tak edge, weight 2
        graph[0].add(new Edge(0, 2, 4)); // Vertex 0 se vertex 2 tak edge, weight 4

        graph[1].add(new Edge(1, 2, 1)); // Vertex 1 se vertex 2 tak edge, weight 1
        graph[1].add(new Edge(1, 3, 7)); // Vertex 1 se vertex 3 tak edge, weight 7

        graph[2].add(new Edge(2, 4, 3)); // Vertex 2 se vertex 4 tak edge, weight 3

        graph[3].add(new Edge(3, 5, 1)); // Vertex 3 se vertex 5 tak edge, weight 1

        graph[4].add(new Edge(4, 3, 2)); // Vertex 4 se vertex 3 tak edge, weight 2
        graph[4].add(new Edge(4, 5, 5)); // Vertex 4 se vertex 5 tak edge, weight 5
    }

    // Pair class jo priority queue ke liye kaam karega
    static class Pair implements Comparable<Pair> {
        int n;    // Vertex number
        int path; // Source se is vertex takka shortest distance

        // Constructor pair ko initialize karne ke liye
        Pair(int n, int path) {
            this.n = n;      // Vertex ka number
            this.path = path; // Shortest path ka distance
        }

        // compareTo method override karna priority queue ke sorting ke liye
        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // Path ka distance ke basis par sort karte hain
        }
    }

    // Dijkstra ka algorithm implement karna
    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // Distance array (source se har vertex takka distance)
        // Sabhi vertices ke liye distance infinity set karna
        for (int i = 0; i < graph.length; i++) {
            dist[i] = Integer.MAX_VALUE; // Infinity
        }
        dist[src] = 0; // Source vertex ka distance 0 set karte hain

        boolean vis[] = new boolean[graph.length]; // Visited array har vertex ko track karne ke liye

        // Priority queue ka use karte hain shortest distance ke basis par
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0)); // Source vertex ko priority queue me add karte hain

        while (!pq.isEmpty()) { // Jab tak queue empty nahi ho
            Pair curr = pq.remove(); // Minimum distance wala vertex nikalte hain
            if (!vis[curr.n]) { // Agar ye vertex abhi tak visited nahi hai
                vis[curr.n] = true; // Is vertex ko visit karte hain

                // Is vertex ke sabhi neighbors ko check karte hain
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i); // Current edge ko access karte hain
                    int u = e.src;  // Current vertex
                    int v = e.dest; // Neighboring vertex
                    int wt = e.wt;  // Edge ka weight

                    // Relaxation step: Agar new path distance kam ho
                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt; // Neighbor ka distance update karte hain
                        pq.add(new Pair(v, dist[v])); // Neighbor ko priority queue me add karte hain
                    }
                }
            }
        }

        // Source se sabhi vertices takke shortest distances print karte hain
        System.out.println("Source vertex " + src + " se sabhi vertices takka shortest distance:");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Vertex " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 6; // Graph me vertices ki sankhya
        ArrayList<Edge> graph[] = new ArrayList[V]; // Graph ko adjacency list me represent karte hain
        createGraph(graph); // Graph banate hain
        int src = 0; // Source vertex jahan se Dijkstra algorithm shuru hoga
        dijkstra(graph, src); // Dijkstra ka function call karte hain
    }
}
