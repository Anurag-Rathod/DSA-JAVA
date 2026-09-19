import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInAnUndirectedGraph {
    public static class Pair{
        int child;
        int parent;
        Pair(int child, int parent){
            this.child = child;
            this.parent = parent;
        }
    }
    public static boolean bfs(int i, boolean[] isVisited, ArrayList<ArrayList<Integer>> adj){
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(i, -1));
        isVisited[i] = true;

        while (!q.isEmpty()) {
            Pair front = q.poll();
            int child = front.child;
            int parent = front.parent;

            for (int neighbour : adj.get(child)) {
                if (!isVisited[neighbour]) {
                    isVisited[neighbour] = true;
                    q.offer(new Pair(neighbour, child));
                } else if (neighbour != parent) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean dfs(int child, int parent, boolean[] isVisited, ArrayList<ArrayList<Integer>> adj){
        isVisited[child] = true;
        for(int elem : adj.get(child)){
            if(isVisited[elem] == false){
                boolean check = dfs(elem, child, isVisited, adj);
                if(check) return true;
            }else if(elem != parent){
                return true;
            }
        }
        return false;
    }
    public static boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int v1 = edge[0];
            int v2 = edge[1];
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }
        boolean[] isVisited = new boolean[V];
        for(int i=0;i<V;i++){
            if(isVisited[i] == false){
                // boolean check = bfs(i,isVisited,adj);
                boolean check = dfs(i,-1,isVisited,adj);
                if(check == true) return true;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        int[][] edges1 = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        int V1 = 4;
        System.out.println(isCycle(V1, edges1)); // true

        int[][] edges2 = {{0, 1},{1, 2}, {2, 3}};
        int V2 = 4;
        System.out.println(isCycle(V2, edges2)); // false
    }
}