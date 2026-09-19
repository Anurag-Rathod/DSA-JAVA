public class RemoveDuplicatesInAString {
    public static void duplicateString(String str,int i,boolean[] map,StringBuilder newSTR){
        if(i==str.length()){
            System.out.println(newSTR);
            return;
        }
        // Get the character at the current index i
        char ch = str.charAt(i);
        // If the character has already appeared (true in map), skip it and move to the next index
        if(map[ch-'a']==true){
            duplicateString(str, i+1, map, newSTR);
        }else{
            // Mark this character as encountered (set map value to true)    
            map[ch-'a'] = true;
            // Append the character to the new string (StringBuilder) and call the function recursively
            duplicateString(str, i+1, map, newSTR.append(ch));//newSTR = newSTR.append(ch); // Equivalent to appending but newSTR is mutable
        }   
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        // boolean[] map = new boolean[26];
        // StringBuilder newSTR = new StringBuilder();
        // duplicateString(str, 0, map, newSTR);
        duplicateString(str, 0, new boolean[26], new StringBuilder());
        
    }
}
//anthore approach
// public static boolean[] arr = new boolean[26];
//     public static void duplicate(String str, StringBuilder newSTR, int idx){
//         if(idx==str.length()){
//             System.out.println(newSTR);
//             return ;
//         }
//         if(arr[str.charAt(idx)-'a'] == false){
//             newSTR.append(str.charAt(idx));
//             arr[str.charAt(idx)-'a'] = true;
//         }
//         duplicate(str, newSTR, idx+1);
//     }
//     public static void main(String[] args) {
//         String s = "aabbaaccddeee";
//         duplicate(s, new StringBuilder(""), 0);
//     }
