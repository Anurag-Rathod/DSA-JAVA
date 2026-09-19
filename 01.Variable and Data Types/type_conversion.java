public class type_conversion {
    public static void main(String[] args){
        // float a = 1;
        // int b = a; this is not allowed in java

        /*Type conversion : conversion happens when
         1.type compatibe : (int to float is allow but int to char is not allow)
         2.destination type > source type 
        */

        // byte -> short -> int -> float -> long -> double
        int a = 1;
        float b = a;
        System.out.println(b);
    }
    
}
