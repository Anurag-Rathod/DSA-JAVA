//Leetcode 785.  Is Graph Bipartite? (Graph Coloring)
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartiteGraph {
    public static boolean bfs(int i, int[] isVisited, int[][] graph){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        // color :- red -> 0, blue -> 1
        isVisited[i] = 0; 

        while(!q.isEmpty()){
            int front = q.poll();
            for(int node : graph[front]){
                if(isVisited[node] == -1){
                    q.offer(node);
                    int color = isVisited[front];
                    if(color == 0){
                        isVisited[node] = 1;
                    }else{
                        isVisited[node] = 0;
                    }
                }else{
                    int color = isVisited[front];
                    if(color == isVisited[node]){
                        return false;
                    }
                }
            }
        }

        return true;
    }
    
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] isVisited = new int[n];
        Arrays.fill(isVisited, -1);

        for(int i=0;i<n;i++){
            if(isVisited[i] == -1){
                if(!bfs(i, isVisited, graph)){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] graph1 = {{1, 2, 3},{0, 2},{0, 1, 3},{0, 2}};// There is no way to partition the nodes into two independent sets such that every edge connects a node in one and a node in the other.
        System.out.println(isBipartite(graph1));//false

        int[][] graph2 = {{1, 3},{0, 2},{1, 3},{0, 2}};// We can partition the nodes into two sets: {0, 2} and {1, 3}.
        System.out.println(isBipartite(graph2));//true 
    }
}