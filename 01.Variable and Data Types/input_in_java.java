import java.util.*;
public class input_in_java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String info = sc.next();//sc.next(): It reads the next token (word) from the input until it encounters a space or newline.
        System.out.print(info);

        //c.nextLine(): It reads the entire line, including spaces, until it encounters a newline.
        String name = sc.nextLine();
        System.out.println(name);

        float pi = sc.nextFloat();
        System.out.println(pi);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
