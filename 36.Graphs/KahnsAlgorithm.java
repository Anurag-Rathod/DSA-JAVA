// Kahn's Algorithm = BFS based Topological Sort
import java.util.ArrayList;
import java.util.Queue;

public class KahnsAlgorithm {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        int[] inDegree = new int[V];
        ArrayList<Integer>[] adj = new ArrayList[V];
        for(int i = 0; i < V; i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            adj[u].add(v);
            inDegree[v]++;
        }

        Queue<Integer> q = new java.util.LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }

        ArrayList<Integer> ts = new ArrayList<>();
        while(!q.isEmpty()) {
            int front = q.poll();
            ts.add(front);

            for(int vertice : adj[front]){
                inDegree[vertice]--;
                if(inDegree[vertice] == 0){
                    q.offer(vertice);
                }
            }
        } 
        
        return ts;
    }
    public static void main(String[] args) {
        int[][] edges1 = {{1, 3}, {2, 3}, {4, 1}, {4, 0}, {5, 0}, {5, 2}};
        int V1 = 6;

        ArrayList<Integer> ts1 = topoSort(V1, edges1); //5 4 2 1 3 0 
        for(int v : ts1){
            System.out.print(v+" ");
        }

        System.out.println();

        int[][] edges2 = {{3, 0}, {1, 0}, {2, 0}};
        int V2 = 4;
        ArrayList<Integer> ts2 = topoSort(V2, edges2);//3 2 1 0 
        for(int v : ts2){
            System.out.print(v+" ");
        }
    }
}
