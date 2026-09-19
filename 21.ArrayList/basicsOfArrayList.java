import java.util.ArrayList;
 
public class basicsOfArrayList {
    public static void main(String[] args) {
        //wrapper classes
        // Integer i = Integer.valueOf(4);
        // System.out.println(i);
        // Float f = Float.valueOf(5f);
        // System.out.println(f);

        //Arraylist  
        ArrayList<Integer> l1 = new ArrayList<>();//ArrayList<Integer> l1 = new ArrayList<Integer>();
        // ArrayList<Float> l2 = new ArrayList<>();
        // ArrayList<Character> l3 = new ArrayList<>();

        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get element at index i
        System.out.println(l1.get(1));//6

        //print ArrayList with for loop
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" "); // 5 6 7 8
        }

        //Printing array List directly
        System.out.println(l1); // [5,6,7,8]

        //adding element at some index i
        l1.add(1,100);// l1 => [5,100,6,7,8]

        //modifying element at some index i
        l1.set(1, 10); // l1 => [5,10,6,7,8]

        //removing element at some index i
        l1.remove(1);// l1 => [5,6,7,8]
        
        //removing am element e from arraulist
        l1.remove(Integer.valueOf(7));//[5,6,8] arar element present hai arraylist me to element remove ho jayenge
        l1.remove(Integer.valueOf(200));//[5,6,8] or agar element arrayList me present nahi hai to kuchh nahi honga
    
        //checking if an element is exists in arrayList or not
        boolean ans = l1.contains(Integer.valueOf(8));
        System.out.println(ans);//true
        System.out.println(l1.contains(Integer.valueOf(500)));//false
        
        //find index of any element
        System.out.println(l1.indexOf(5));//return 0
        System.out.println(l1.indexOf(99));//return -1
        l1.add(5);// l1 => [5,6,8,5]
        System.out.println(l1.lastIndexOf(5));//return 3
        
        System.out.println(l1.isEmpty());//false


        //if we don't specify class we can put anything inside arraylist
        // ArrayList a = new ArrayList();
        // a.add(1);
        // a.add(true);
        // a.add("Hello");
        // a.add(7.6);
        // a.add('A');
        // System.err.println(a);//[1, true, Hello, 7.6, A]
    }
}