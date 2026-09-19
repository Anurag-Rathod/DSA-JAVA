//Q. finding the first non-repeating character in a stream of characters 
// input : "aabccxb"
//output : a -1 b b b b x 
import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingLetter {
    public static void print(String str){
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (q.size()!=0 && freq[q.peek()-'a']>1) {
                q.remove();
            }
            if(q.size()==0){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        print(str);
    }
}