import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortUsingDFS {
    public static void dfs(int i, boolean[] isVisited, Stack<Integer> st, ArrayList<Integer>[] adj){
        isVisited[i] = true;
        for(int v : adj[i]){
            if(!isVisited[v]){
                dfs(v, isVisited, st, adj);
            }
        }
        st.push(i);
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<Integer>[] adj = new ArrayList[V];
        for(int i = 0; i < V; i++){
            adj[i] = new ArrayList<>();
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            adj[u].add(v);
        }
        
        Stack<Integer> st = new Stack<>();
        boolean[] isVisited = new boolean[V];
        
        for(int i=0; i < V; i++){
            if(!isVisited[i]){
                dfs(i, isVisited, st, adj);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        
        return res;
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
