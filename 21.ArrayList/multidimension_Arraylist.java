import java.util.ArrayList;

public class multidimension_Arraylist {
    public static void main(String[] args) {
        //multidimension Arraylist
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(6);

        mainList.add(list1);//mainList = [[1, 2]]
        mainList.add(list2);//mainList = [[1, 2], [3, 4]]
        mainList.add(list3);//mainList = [[1, 2], [3, 4], [5, 6]]
        System.out.println(mainList);//[[1, 2], [3, 4], [5, 6]]

        //print multidimension Arraylist elements using loop
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
