public class trappingRainwater {
    public static int trapWater(int[] height){
        int n = height.length;
        //calculate left Max boundary -array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary -array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //loop to calculate trapped water
        int trapped_water = 0;
        for(int i=0;i<n;i++){
            //waterLevel = min(left max boundary, right max boundary)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trapped Water = (waterLevel - height[i]) * width (but in this case width = 1)
            trapped_water += waterLevel - height[i];
        }
        return trapped_water;
    } 
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println("trapped water is : "+trapWater(height));
    }
}
