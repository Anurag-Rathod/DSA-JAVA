//Q. How many ways can a person reach the 5th stair if they can take 1 or 2 steps at a time
public class StairPath2JumpsMax {
    public static int NumOfJumps(int stairs){
        if(stairs==2){
            return 2;
        }
        if(stairs==1){
            return 1;
        }
        int OneSteps = NumOfJumps(stairs-1);
        int twoSteps = NumOfJumps(stairs-2);
        int totalJumps = OneSteps + twoSteps;
        return totalJumps;
    }
    public static void main(String[] args) {
     int ways = NumOfJumps(5);
     System.out.println(ways);   
    }
}
