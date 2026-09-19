import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int n = sc.nextInt();
        sc.close();
        // A B C D 
        // A B C D 
        // A B C D 
        // A B C D 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+" ");//using type casting (ASCII value of A=65)
            }
            System.out.println();
        }
        // for(int i=1;i<=n;i++){
        //     char ch = 'A';
        //     for(int j=1;j<=n;j++){
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+96)+" ");//using type casting (ASCII value of a=96)
            }
            System.out.println();
        }
    }
}
