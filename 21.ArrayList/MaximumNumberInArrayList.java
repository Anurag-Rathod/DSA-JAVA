import java.util.ArrayList;

public class MaximumNumberInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(7);

        int maxNo = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            maxNo = Math.max(maxNo, list.get(i));
        }
        
        System.out.println(maxNo);
    }
}
