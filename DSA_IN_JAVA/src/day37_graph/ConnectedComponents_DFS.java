package day37_graph;

import day36_graph.DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ConnectedComponents_DFS {
    static class Edge {
        
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        public static void createGraph(ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }
            // Add edges to the graph (for a connected graph with multiple components)
            // Component 1: Nodes 0, 1, 2
            graph[0].add(new Edge(0, 1, 1));
            graph[1].add(new Edge(1, 0, 1));

            graph[0].add(new Edge(0, 2, 1));
            graph[2].add(new Edge(2, 0, 1));

            // Component 2: Nodes 3, 4
            graph[3].add(new Edge(3, 4, 1));
            graph[4].add(new Edge(4, 3, 1));

            // Component 3: Nodes 5, 6
            graph[5].add(new Edge(5, 6, 1));
            graph[6].add(new Edge(6, 5, 1));
        }
        public static void dfs(ArrayList<Edge>[] graph){
            boolean vis[] = new boolean[graph.length];
            for (int i=0;i<graph.length;i++){
               // Only call dfsUtil if the node hasn't been visited
                if (!vis[i]) {
                    dfsUtil(graph, i, vis);  // Start DFS from this node
                }
            }
        }
        public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) { // O(V+E)
            //visit
            System.out.print(curr + " ");
            vis[curr] = true;

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    dfsUtil(graph, e.dest,vis);
                }
            }
         }

        public static void main(String[] args) {
            int V = 7;
            ArrayList<Edge> graph[] = new ArrayList[V];
            createGraph(graph);
            dfs(graph);
        }
    }
}
