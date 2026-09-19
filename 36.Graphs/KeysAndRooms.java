import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
     // BFS Function
    public static void bfs(int start, List<List<Integer>> graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {

            int currentRoom = queue.poll();

            // Traverse all neighbouring rooms
            for (int neighbour : graph.get(currentRoom)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.offer(neighbour);

                }

            }

        }

    }

    // Check if all rooms can be visited
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        bfs(0, rooms, visited);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        // List<List<Integer>> rooms = new ArrayList<>();
        // rooms.add(new ArrayList<>(Arrays.asList(1)));
        // rooms.add(new ArrayList<>(Arrays.asList(2)));
        // rooms.add(new ArrayList<>(Arrays.asList(3)));
        // rooms.add(new ArrayList<>());
        // boolean answer = canVisitAllRooms(rooms); //true

        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(new ArrayList<>(Arrays.asList(3, 0, 1)));   // Room 1
        rooms.add(new ArrayList<>(Arrays.asList(1, 3)));      // Room 0
        rooms.add(new ArrayList<>(Arrays.asList(0)));         // Room 3
        rooms.add(new ArrayList<>());                              // Room 2
        boolean answer2 = canVisitAllRooms(rooms); //false
        System.out.println("Can Visit All Rooms = " + answer2);
    }
}
