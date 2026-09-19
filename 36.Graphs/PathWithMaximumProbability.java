// Leetcode 1514. Path with Maximum Probability

import java.util.*;

public class PathWithMaximumProbability {
    public static class Pair implements Comparable<Pair>{
        int node;
        double probability;

        Pair(int node, double probability){
            this.node = node;
            this.probability = probability;
        }

        public int compareTo(Pair p){
            return Double.compare(this.probability, p.probability);
        }
    }
    public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end){
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            double p = succProb[i];
            adj.get(u).add(new Pair(v, p));
            adj.get(v).add(new Pair(u, p));
        }

        double[] arr = new double[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Pair(start, 1));
        arr[start] = 1;

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            double currPro = curr.probability;
            int currNode = curr.node;

            if(currPro < arr[currNode]){
                continue;
            }

            for(Pair node : adj.get(currNode)){
                int nextNode = node.node;
                double nextNodePro = node.probability;

                double newPro = currPro * nextNodePro;
                if(newPro > arr[nextNode]){
                    arr[nextNode] = newPro;
                    pq.add(new Pair(nextNode, newPro));
                }
            }
        }

        return arr[end];
    }
    public static void main(String[] args) {
        int n1 = 3;
        int[][] edges1 = {{0,1}, {1,2}, {0,2}};
        double[] succProb1 = {0.5,0.5,0.2}; 
        int start_node1 = 0; 
        int end_node1 = 2;
        System.out.println(maxProbability(n1, edges1, succProb1, start_node1, end_node1));//0.25

        int n2 = 3;
        int[][] edges2 = {{0,1}, {1,2}, {0,2}}; 
        double[] succProb2 = {0.5,0.5,0.3};
        int start_node2 = 0; 
        int end_node2 = 2;  
        System.out.println(maxProbability(n2, edges2, succProb2, start_node2, end_node2));//0.3

        int n3 = 3;
        int[][] edges3 = {{0,1}};
        double[] succProb = {0.5};
        int start_node3 = 0; 
        int end_node3 = 2;
        System.out.println(maxProbability(n3, edges3, succProb, start_node3, end_node3));//0.0
    }
}
