package day39_graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim_Algo_Find_Edge_ToMinWeight {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;
        int parent;

        public Pair(int v, int cost, int parent) {
            this.v = v;
            this.cost = cost;
            this.parent = parent;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // Ascending order based on cost
        }
    }

    public static void mst(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0, -1)); // Starting from node 0 with cost 0 and no parent
        int finalCost = 0; // MST total minimum weight

        ArrayList<Edge> mstEdges = new ArrayList<>(); // To store MST edges

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;

                // If there's a valid parent, add the edge to the MST
                if (curr.parent != -1) {
                    mstEdges.add(new Edge(curr.parent, curr.v, curr.cost));
                }

                // Add all neighbors of the current node to the priority queue
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt, curr.v));
                    }
                }
            }
        }

        // Print the MST cost
        System.out.println("Min cost of MST = " + finalCost);

        // Print the MST edges
        System.out.println("Edges in the MST:");
        for (Edge e : mstEdges) {
            System.out.println(e.src + " - " + e.dest + " @ " + e.wt);
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        mst(graph);
    }
}
