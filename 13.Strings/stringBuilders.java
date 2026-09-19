// import java.util.Scanner;
public class stringBuilders {
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        // StringBuilder s1 = new StringBuilder(sc.nextLine()); :-> way of taking input of Stringbuilder
        // System.out.println(s1);
        StringBuilder str = new StringBuilder("Kello");
        System.out.println(str);
        str.setCharAt(0,'H');//Hello
        
        System.out.println(str);
        str.append(" WORLD");//Hello WORLD

        System.out.println(str);
        str.append(true);//Hello WORLDtrue
        System.out.println(str);
        str.append('c');//Hello WORLDtruec

        System.out.println(str);
        str.deleteCharAt(15);//Hello WORLDtrue
        System.out.println(str);
        str.delete(11, 15);//Hello WORLD
        System.out.println(str);
        
        str.insert(5, 'o');
        System.out.println(str);//Helloo WORLD
        
        str.reverse();
        System.out.println(str);//DLROW oolleH
        System.out.println(str);//Helloo WORLD
        //reverse string : 
        // int a = 0;
        // int b = str.length()-1;
        // while (a<b) {
        //     char temp = str.charAt(a);
        //     str.setCharAt(a, str.charAt(b)); 
        //     str.setCharAt(b, temp);
        //     a++;
        //     b--;
        // }
        // System.out.println(str);
    }
}   
