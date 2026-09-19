// Q. How many ways can a person reach the 5th stair 
// if they can take 1, 2, or 3 steps at a time?
public class StairPath3JumpsMax {
    // This method calculates the number of ways to reach the given stair 
    // when the person can jump 1, 2, or 3 stairs at a time
    public static int NumOfJumps(int stairs){
        // Base case: if 3 stairs remain, the possible combinations to reach it are:
        // 1+1+1, 1+2, 2+1, and 3 → total 4 ways
        if(stairs == 3){
            return 4;
        }
        // Base case: if 2 stairs remain, possible combinations are:
        // 1+1 and 2 → total 2 ways
        if(stairs == 2){
            return 2;
        }
        // Base case: if only 1 stair remains, there's only one way:
        // a single 1-step jump
        if(stairs == 1){
            return 1;
        }
        // Recursive step:
        // Total ways to reach current stair is the sum of:
        // ways to reach (stairs - 1), (stairs - 2), and (stairs - 3)
        int OneSteps = NumOfJumps(stairs - 1);
        int twoSteps = NumOfJumps(stairs - 2);
        int threeSteps = NumOfJumps(stairs - 3);

        // Sum of all ways from different step combinations
        int totalJumps = OneSteps + twoSteps + threeSteps;
        return totalJumps;
    }

    public static void main(String[] args) {
     // Calculates and prints the number of ways to reach the 4th stair
     int ways = NumOfJumps(4);
     System.out.println(ways); // Output should be 7 (ways: 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1)
    }
}
