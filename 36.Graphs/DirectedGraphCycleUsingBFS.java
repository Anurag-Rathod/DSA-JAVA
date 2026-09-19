/* Kahn's Algorithm — Cycle Detection
Use BFS + Indegree to detect a cycle in a directed graph.
Calculate the indegree of every vertex and add all indegree = 0 vertices to a queue.
Remove vertices from the queue and decrease the indegree of their neighbors.
If a neighbor's indegree becomes 0, add it to the queue.
Keep a count of processed vertices.
If count == V → No cycle.
If count != V → Cycle exists.

Time: O(V + E)
Space: O(V + E)
*/

import java.util.ArrayList;
import java.util.Queue;

public class DirectedGraphCycleUsingBFS {
    public static boolean isCyclic(int V, int[][] edges) {
        int[] inDegree = new int[V];
        ArrayList<Integer>[] adj = new ArrayList[V];
        for(int i=0;i<V;i++){
            adj[i] = new ArrayList<Integer>();
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
        
        int count = 0;
        while(!q.isEmpty()){
            int front = q.poll();
            count++;
            
            for(int v : adj[front]){
                inDegree[v]--;
                
                if(inDegree[v] == 0){
                    q.offer(v);
                }
            }
        }
        
        return count != V;
    }
    public static void main(String[] args) {
        int[][] edges1 = {{0, 1}, {1, 2}, {2, 0}, {2, 3}};//cycle in the graph (a cycle 0 -> 1 -> 2 -> 0)
        int V1 = 4;
        System.out.println(isCyclic(V1, edges1));//true

        int[][] edges2 = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};//no cycle in the graph
        int V2 = 4;
        System.out.println(isCyclic(V2, edges2));// false
    }
}