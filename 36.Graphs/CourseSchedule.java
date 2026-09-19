//Leetcode 207. Course Schedule
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        for(int course=0; course < numCourses; course++){
            adj[course] = new ArrayList<>();
        }
        int[] inDegree = new int[numCourses];
        for(int[] p : prerequisites){
            int course1 = p[1];
            int course2 = p[0];

            adj[course1].add(course2);
            inDegree[course2]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int course=0; course < numCourses; course++){
            if(inDegree[course] == 0){
                q.offer(course);
            }
        }

        int count = 0;
        while(!q.isEmpty()){
            int front = q.poll();
            count++;

            for(int pc : adj[front]){
                inDegree[pc]--;

                if(inDegree[pc] == 0){
                    q.add(pc);
                }
            }
        }

        return count == numCourses;
    }
    public static void main(String[] args) {
        int numCourses1 = 2; 
        int[][] prerequisites2 = {{1,0}};
        System.out.println(canFinish(numCourses1, prerequisites2));//true (There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.)

        int numCourses2 = 2;
        int[][] prerequisites = {{1,0},{0,1}};
        System.out.println(canFinish(numCourses2, prerequisites));//false (There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.)
    }
}
