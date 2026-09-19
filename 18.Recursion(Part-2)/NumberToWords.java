// Problem Statement: You are given a number (e.g., 2019). Convert it into a String of English words like "two zero one nine". You must use a recursive function to solve this problem.
// Note: The digits of the number will only be in the range 0-9, and the last digit of a number can't be 0.

// Sample Input: 1947
// Sample Output: "one nine four seven"
public class NumberToWords {
    public static void printDigits(int numbers, String[] WordNums){
        if(numbers==0){
            return;
        }
        int lastDigit = numbers%10;
        printDigits(numbers/10, WordNums);
        System.out.print(WordNums[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int numbers = 2025;
        String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        printDigits(numbers, nums);
    }
}
