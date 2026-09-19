import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        ArrayList<int[]>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // edges[i] = {u, v, weight}
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj[u].add(new int[]{v, wt});
            adj[v].add(new int[]{u, wt});
        }

        // distance from source
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        // {distance, node}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, src});

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int currDist = curr[0];
            int node = curr[1];
            if (currDist != dist[node]) {
                continue;
            }
            // Explore neighbors
            for (int[] neighbor : adj[node]) {

                int nextNode = neighbor[0];
                int weight = neighbor[1];

                int newDist = currDist + weight;

                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    pq.offer(new int[]{newDist, nextNode});
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int d : dist) {
            ans.add(d);
        }

        return ans;
    }
    public static void main(String[] args) {
        int V1 = 3;
        int[][] edges1 = {{0, 1, 1}, {1, 2, 3}, {0, 2, 6}};
        int src1 = 2;
        ArrayList<Integer> shortestPaths1 = dijkstra(V1, edges1, src1);//[4, 3, 0]
        // Shortest Paths:
        // For 2 to 1 minimum distance will be 3. By following path 2 -> 1
        // For 2 to 0 minimum distance will be 4. By following path 2 -> 1 -> 0
        // For 2 to 2 minimum distance will be 0. By following path 2 -> 2
        for(int p : shortestPaths1){
            System.out.print(p+" ");
        }
        System.out.println();

        int V2 = 5;
        int[][] edges2 = {{0, 1, 4}, {0, 2, 8}, {1, 4, 6}, {2, 3, 2}, {3, 4, 10}};
        int src2 = 0;
        ArrayList<Integer> shortestPaths2 = dijkstra(V2, edges2, src2);//[0, 4, 8, 10, 10]
        // Shortest Paths: 
        // For 0 to 2 minimum distance will be 8. By following path 0 -> 2
        // For 0 to 1 minimum distance will be 4. By following path 0 -> 1
        // For 0 to 4 minimum distance will be 10. By following path 0 -> 1 -> 4
        // For 0 to 3 minimum distance will be 10. By following path 0 -> 2 -> 3 
        for(int p : shortestPaths2){
            System.out.print(p+" ");
        }
    }
}
