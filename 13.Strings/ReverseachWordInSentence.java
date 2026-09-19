//Q. Reverse each word in a sentence
// input : i am an IAS officer
// output : i ma SAI reciffo
public class ReverseachWordInSentence {
    public static void main(String[] args) {
        String str = "i am an IAS officer";
        // Initialize an empty string to store the final result
        String ans = "";
        // StringBuilder to build each reversed word
        StringBuilder demo = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // If the character is not a space, append it to the StringBuilder (demo)
            if(ch!=' '){
                demo.append(ch);
            }else{
                // When a space is encountered, reverse the word in the StringBuilder (demo)
                demo.reverse();// Reverse the word built so far

                // Add the reversed word to the final answer string
                ans += demo;// For example, after reversing "i", ans becomes "i"

                // Add a space after each reversed word
                ans += " ";// For example, after reversing "am", ans becomes "i ma"

                demo = new StringBuilder("");// Now demo is empty to start the next word    
            }
        }
        // After the loop, reverse the last word (since the loop may not handle the last word if there's no space)
        demo.reverse();  // Reverse the last word (e.g., "officer" -> "reciffo")
        
        // Add the last reversed word to the answer
        ans += demo;  // After reversing "officer", ans becomes "i ma na SAI reciffo"
        
        // Print the final answer (reversed words)
        System.err.println(ans);  // Output: i ma na SAI reciffo
    }
}
