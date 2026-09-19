import java.util.*;

public class hashmapSyntax {
    public static void main(String[] args) {
        //syntax of map
        Map<String, Integer> mp = new HashMap<>();
        mp.clear();
        //adding elements to map
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        //getting value of a key from hashmap
        System.out.println(mp.get("Yash"));//16
        System.out.println(mp.get("Pawan"));//null (agr koi key hashmap me hai nahi to hashmap us key ke liye null return karta hai)
        
        //changing/updating value of a key in hashmap 
        mp.put("Akash", 25);//replace the existing value(21) associated with "Akash" with the new value 25.
        
        //removing a pair from the hashmap
        System.out.println(mp.remove("Akash"));// 25
        System.out.println(mp.remove("vikash"));// null
        
        //checking  if key is in the hashmap
        System.out.println(mp.containsKey("shaquir"));//false
        System.out.println(mp.containsKey("yash")); // true
        
        //adding a new entry only if the new key doesn't exist already
        // if(!mp.containsKey("shaquir")) mp.put("shaqir", 27);
        mp.putIfAbsent("shaquir", 27);// will enter
        mp.putIfAbsent("Yash", 36);// will not enter

        //got all key in the hashmap
        System.out.println(mp.keySet());

        //got all value in the hashmap
        System.out.println(mp.values());

        //got all entries in the hashmap
        System.out.println(mp.entrySet());

        //traversing all entries of hashmap - multiple methods
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}
