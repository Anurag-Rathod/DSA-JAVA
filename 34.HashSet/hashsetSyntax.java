/*  Q.) Given an unsorted array of int nums, return the length of the longest consecutive elements sequence
    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
import java.util.HashSet;
public class hashsetSyntax {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);//hs => 1
        hs.add(2);//hs => 1 2
        hs.add(1);//hs => 1 2
        System.out.println(hs.contains(3));//false
        System.out.println(hs.contains(1));//true
        System.out.println("size of HashSet(hs) is : "+hs.size());//2
        hs.add(4);//hs => 1 2 4
        hs.add(5);//hs => 1 2 4 5
        hs.add(6);//hs => 1 2 4 5 6
        hs.add(6);//hs => 1 2 4 5 6
        for(int n : hs){
            System.out.print(n+ " ");
        }   
        System.out.println();
    }
}
