public class swapTwoNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        
        //swap two number using third variable
        int tem = a;
        a = b;
        b = tem;
        System.out.println("a = "+a+" b = "+b);



        int x = 4;
        int y = 5;
        //swap two number without using third variable
        x = x+y;//4+5=9
        y = x-y;//9-5=4
        x = x-y;//9-4=5
        System.out.println("x = "+x+" y = "+y);
    }
}
