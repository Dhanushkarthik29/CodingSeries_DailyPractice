import java.util.*;

class Graph {
    private int V;  // Vertices
    private LinkedList<Integer> adj[];  

    Graph(int v) {  // constructor for graph
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();  // added in linkedlist for every vertices from 0,1,2,3
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int start) {
        boolean visited[] = new boolean[V];        // visited node true/false
        Queue<Integer> queue = new LinkedList<>(); // add element in the queue

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {     // recursively adding element upto queue became empty
            int node = queue.poll();   // removing first element from the queue
            System.out.print(node + " ");

            for (int neighbour : adj[node]) {
                if (!visited[neighbour]) {     // if node is not present in the visited then 
                    visited[neighbour] = true; // set as a visited
                    queue.add(neighbour);      // add in the queue
                }
            }
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        // Adjacency Vertices list
        // 0 -> 1,2
        // 1 -> 2
        // 2 -> 0,3
        // 3 -> 3

        System.out.println("BFS starting from node 2:");
        g.BFS(2);
    }
}
