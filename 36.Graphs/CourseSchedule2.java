//Leetcode 210. Course Schedule II

import java.util.ArrayList;
import java.util.Queue;

public class CourseSchedule2 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        for(int course=0; course < numCourses; course++){
            adj[course] = new ArrayList<>();
        }
        int[] inDegree = new int[numCourses];
        for(int[] p : prerequisites){
            int course1 = p[1];// prerequisite
            int course2 = p[0];// course

            adj[course1].add(course2);
            inDegree[course2]++;
        }

        Queue<Integer> q = new java.util.LinkedList<>();
        for(int course=0; course < numCourses; course++){
            if(inDegree[course] == 0){
                q.offer(course);
            }
        }

        int[] ordering = new int[numCourses];
        int idx = 0;
        int count = 0;
        
        while(!q.isEmpty()){
            int front = q.poll();
            ordering[idx++] = front;
            count++;

            for(int pc : adj[front]){
                inDegree[pc]--;

                if(inDegree[pc] == 0){
                    q.add(pc);
                }
            }
        }

        // Cycle exists
        if(count != numCourses){
            return new int[0];
        }

        return ordering;
    }
    public static void main(String[] args) {
        int numCourses1 = 2; 
        int[][] prerequisites1 = {{1,0}};
        int[] ordering1 = findOrder(numCourses1, prerequisites1);
        for(int c : ordering1){
            System.out.print(c+" ");
        }

        System.out.println();

        int numCourses2 = 4;
        int[][] prerequisites2 = {{1,0},{2,0},{3,1},{3,2}};
        int[] ordering2 = findOrder(numCourses2, prerequisites2);
        for(int c : ordering2){
            System.out.print(c+" ");
        }
    }
}
