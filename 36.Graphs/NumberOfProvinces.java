import java.util.*;
import java.util.LinkedList;

public class NumberOfProvinces {
    // BFS Function
    public static void bfs(int start, int[][] graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {

            int currentNode = queue.poll();

            for (int neighbour = 0; neighbour < graph.length; neighbour++) {

                if (graph[currentNode][neighbour] == 1 && !visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.offer(neighbour);

                }

            }

        }

    }

    // Find Number of Provinces
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int city = 0; city < n; city++) {
            if (!visited[city]) {
                bfs(city, isConnected, visited);
                provinces++;
            }
        }
        
        return provinces;

    }
    public static void main(String[] args) {
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int answer = findCircleNum(isConnected);
        System.out.println("Number of Provinces = " + answer);

    }

}
