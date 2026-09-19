public class DoWhileLoop {
    public static void main(String[] args) {
        // do-while loop mein pehle code execute hota hai, uske baad condition check hoti hai.
        // Isliye condition false hone par bhi loop minimum 1 baar chalega.
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


        // Example:
        // Condition starting mein false hai, phir bhi loop ek baar chalega
        int j = 10;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}