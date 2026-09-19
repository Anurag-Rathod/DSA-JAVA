import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(5);

        System.out.println("Orignal ArrayList : "+list);
        Collections.sort(list);
        System.out.println("Ascending order is : "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order is : "+list);

        //  Sort an Array List of strings in Ascending & Descending order
        ArrayList<String> l = new ArrayList<>();
        l.add("welcome");
        l.add("to");
        l.add("physics");
        l.add("wallah");
        System.out.println("Orignal ArrayList : "+l);
        // yaha lexicographically sorted string milti hai
        Collections.sort(l);
        System.out.println("Ascending order is : "+l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Descending order is : "+l);
    }
}
