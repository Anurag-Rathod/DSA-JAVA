//Q.for given string convert each the first letter of each word to uppercase
//input : hi i am anurag rathod
//output : Hi I Am Anurag Rathod
public class convertFirstLetterOfEachWordToUppercase {
    public static void main(String[] args) {
        String str = "hi i am anurag rathod";
        StringBuilder ans = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        ans.append(ch);
        for(int i=1;i<str.length();i++){
            // Check if the current character is a space
            if(str.charAt(i)==' ' && i<str.length()){
                // If it's a space, add the space to the result
                ans.append(str.charAt(i));
                i++;// Skip to the next character (the first letter of the next word)
                // Capitalize the first letter of the next word
                ans.append(Character.toUpperCase(str.charAt(i)));
            }else{
                // If it's not a space, just add the character to the result
                ans.append(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
