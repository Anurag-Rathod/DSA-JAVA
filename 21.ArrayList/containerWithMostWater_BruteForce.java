public class containerWithMostWater_BruteForce {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxWater = 0;
        
        //BruteForce : Time complexity  O(n^2)
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int ht = Math.min(height[i], height[j]);
                int width = j-i;
                int currentWater = ht * width;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        System.out.println(maxWater);
    }
}
