public class TowerOfHanoi {
    public static void towar(int n,int source, int helper, int destination){
        if(n==1){
            System.out.println("Move disk "+n+" from rod "+source+" to rod "+destination);
            return;
        }
        towar(n-1, source, destination, helper);
        System.out.println("Move disk "+n+" from rod "+source+" to rod "+destination);
        towar(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        towar(3, 1, 2, 3);
    }
}
