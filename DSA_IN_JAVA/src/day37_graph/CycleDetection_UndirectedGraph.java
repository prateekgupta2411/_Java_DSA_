package day37_graph;

import java.util.ArrayList;

public class CycleDetection_UndirectedGraph {
    static class Edge {
        int src;  // Corrected the typo from 'scr' to 'src'
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) { // Corrected the method signature
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // Properly initialize each element
        }

        // Add edges for the undirected graph
//        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

//        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }
    // O(V+E)
    // Cycle detection in an undirected graph using DFS
    public static boolean isCyclic(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
        visited[curr] = true;

        for (Edge e : graph[curr]) {
            // cse3
            if (!visited[e.dest]) {
                if (isCyclic(graph, visited, e.dest, curr)) {
                    return true;
                }
            }
            // case 1
            else if (e.dest != parent) { // If visited and not parent, cycle detected
                return true;
            }
            // case 2-> do nothing
        }
        return false;
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph, int V) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) { // check for different component
            if (!visited[i]) {
                if (isCyclic(graph, visited, i, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        if (detectCycle(graph, V)) {
            System.out.println("Cycle detected in the graph.");
        } else {
            System.out.println("No cycle in the graph.");
        }
    }
}
