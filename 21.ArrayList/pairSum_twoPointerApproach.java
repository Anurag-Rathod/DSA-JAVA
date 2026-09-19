import java.util.ArrayList;
public class pairSum_twoPointerApproach {
    //2 Pointer Approach => time complexity O(n)
    //this method work only on sorted array
    public static boolean sum1(ArrayList<Integer> list,int target){
        int start = 0;
        int end = list.size()-1;

        while (start<end/*or we can use start!=end*/) {
            //case 1
            if(list.get(start)+list.get(end)==target){
                return true;
            }
            //case 2
            else if(list.get(start)+list.get(end) < target){
                start++;
            }
            //case 3
            else{
                end--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
       System.out.println( sum1(list,target));
    }
}

