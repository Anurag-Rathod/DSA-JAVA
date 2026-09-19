import java.util.*;
import java.util.LinkedList;
public class BFSTraversal {
    // BFS Function
    public static void bfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {

            int currentNode = queue.poll();

            // Process current node
            System.out.print(currentNode + " ");

            // Traverse all neighbours
            for (int neighbour : graph.get(currentNode)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.offer(neighbour);

                }
            }
        }
    }
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // Initialize Graph
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add Edges (Undirected Graph)
        graph.get(0).add(1);
        graph.get(1).add(0);
        
        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        boolean[] visited = new boolean[vertices];

        System.out.print("BFS Traversal: ");

        bfs(0, graph, visited);
    }
}