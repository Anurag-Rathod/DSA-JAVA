import java.util.*;
import java.util.LinkedList;

public class FindIfPathExistsInGraph {
    // BFS Function
    public static void bfs(int source, List<List<Integer>> adj, boolean[] isVisited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        isVisited[source] = true;

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            // Traverse all neighbours
            for(int neighbour : adj.get(currentNode)) {
                if(!isVisited[neighbour]) {
                    isVisited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }

    // Check if path exists
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        // Create adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        // Add edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] isVisited = new boolean[n];
        bfs(source, adj, isVisited);

        return isVisited[destination];

    }
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0}
        };

        int source = 0;
        int destination = 2;

        boolean answer = validPath(n, edges, source, destination);

        System.out.println("Path Exists = " + answer);
    }

}