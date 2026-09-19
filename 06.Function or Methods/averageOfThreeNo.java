import java.util.Scanner;
public class averageOfThreeNo {
    public static int average(int x,int y,int z){
        int avg = (x+y+z)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int n3 = sc.nextInt();
        sc.close();

        int avg = average(n1,n2,n3);
        System.out.println("Average of this three number is : "+avg);
    }    
}
