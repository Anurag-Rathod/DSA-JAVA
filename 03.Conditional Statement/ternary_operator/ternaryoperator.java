public class ternaryoperator {
    public static void main(String args[]){
        //ternary operator : 
        //variable = condition?statement1 :statement2;

        int larger = (5<3)? 5 : 3;
        System.out.println(larger);

        String type = (20%2==0)? "Even":"Odd";
        System.out.println(type) ;

        int marks = 75;
        String result = marks>=33? "Pass" : "Fail";
        System.out.print(result);
    }
}
