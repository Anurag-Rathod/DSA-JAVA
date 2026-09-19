//Q. input : aaabbbbcdddee
//   ouput : a3b4cd3e2 
public class CompressString {
    public static void main(String[] args){
        String str = "aaabbbbcdddee";
        String compressStr = ""+str.charAt(0);// Initialize the compressed string starting with the first character
        int count = 1;// Variable to count consecutive occurrences of characters

        for(int i=1;i<str.length();i++){
            /// Get the previous and current character to compare
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i-1);
            // If the current character is the same as the previous one, increase the count
            if(currentChar == previousChar){
                count++;
            }else{
                // If the count is more than 1, add the count after the character
                if(count>1) compressStr += count;
                // Reset the count to 1 and add the new character to the result
                count = 1;
                compressStr += currentChar;
            }
        }

        // After the loop, if the last sequence of characters was repeated, add the count
        if(count>1) compressStr += count;
        System.out.println(compressStr);
    }
}
