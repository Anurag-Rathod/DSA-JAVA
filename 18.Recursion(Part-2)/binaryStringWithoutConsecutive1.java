//Q. print all binary strings of size N without consecutive ones
public class binaryStringWithoutConsecutive1 {
    public static void printBinarySTR(int n,int last,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        // if(last==0){
        //     printBinarySTR(n-1, 0, str+"0");
        //     printBinarySTR(n-1, 1, str+"1");
        // }else{
        //     printBinarySTR(n-1, 0, str+"0");
        // }
        printBinarySTR(n-1, 0, str+"0");
        // If the last digit was not 1, we can safely add a 1
        if(last==0){
            printBinarySTR(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinarySTR(3, 0, "");
    }
}
