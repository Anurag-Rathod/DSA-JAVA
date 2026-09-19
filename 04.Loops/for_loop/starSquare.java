import java.util.Scanner;

public class starSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of sides : ");
        int side = sc.nextInt();
        sc.close();

        for(int i=1;i<=side;i++){
            for(int j=1;j<=side;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
