import java.util.ArrayList;
public class DFStraversal {
    public static void helperDFS(int v, boolean[] isVisited, ArrayList<ArrayList<Integer>> adj) {
        isVisited[v] = true;
        System.out.print(v+" ");
        for(int x : adj.get(v)){
            if(isVisited[x] == false){
                helperDFS(x, isVisited, adj);
            }
        }
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] isVisited = new boolean[n];
        helperDFS(0, isVisited, adj);
    }
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // Initialize adj
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Add Edges (Undirected adj)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        System.out.print("BFS Traversal: ");
        dfs(adj);
    }
}
