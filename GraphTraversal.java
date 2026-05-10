import java.util.*;

public class GraphTraversal {
    private int vertices;
    private LinkedList<Integer> adjList[];

    GraphTraversal(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    void addEdge(int v, int w) {
        adjList[v].add(w);
    }
    void BFS(int start) {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    void DFS(int start) {
        boolean visited[] = new boolean[vertices];
        DFSUtil(start, visited);
    }

    void DFSUtil(int node, boolean visited[]) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphTraversal g = new GraphTraversal(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("BFS Traversal:");
        g.BFS(0);

        System.out.println("\nDFS Traversal:");
        g.DFS(0);
    }
}