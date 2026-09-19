import java.util.*;
public class MostFrequentElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int ans = 0, maxFreq = 0;
        for(var el : freq.entrySet()){
            if(el.getValue()>maxFreq){
                maxFreq = el.getValue();
                ans = el.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times\n",ans,maxFreq);
        for(var key : freq.keySet()){
            if(freq.get(key)>maxFreq){
                maxFreq = freq.get(key);
                ans = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",ans,maxFreq);
    }
}
