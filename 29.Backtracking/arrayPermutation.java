import java.util.*;
public class arrayPermutation {
    public static void helper(int[] nums,List<Integer> temp,boolean[] isValid,List<List<Integer>> ans){
        if(nums.length==temp.size()){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<temp.size();i++){
                list.add(temp.get(i));
            }
            ans.add(list);
        }

        for(int i=0;i<nums.length;i++){
            if(isValid[i]==false){
                temp.add(nums[i]);
                isValid[i] = true;

                helper(nums,temp,isValid,ans);

                isValid[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];
        helper(nums,temp,isValid,ans);

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
