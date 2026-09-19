import java.util.ArrayList;
public class ReverseAnArrayList {
    public static void reverse(ArrayList<Integer> list){
        int start = 0;
        int end = list.size()-1;
        while (start < end) {
            Integer temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Orignal ArrayList : "+list);
        reverse(list);
        // Collections.reverse(list);
        System.out.println("Reverse ArrayList : "+list);

    }
}
