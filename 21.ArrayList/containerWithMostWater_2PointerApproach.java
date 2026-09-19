public class containerWithMostWater_2PointerApproach {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxWater = 0;

        //2 pointer Approach => Time complexity O(n)
        int left = 0;
        int right = height.length-1;
        while (left<right) {
            int ht = Math.min(height[left], height[right]);
            int width = right - left;
            int correntWatter = ht * width;
            maxWater = Math.max(maxWater, correntWatter);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxWater);
    }
}
