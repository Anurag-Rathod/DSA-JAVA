public class printAllSubstrings{
    public static void main(String[] args) {
        String s = "Hello";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i, j)+" ");//substring(0,0) give 0 isliye ye wala loop i+1 se start kra
            }
            System.out.println();
        }
    }
}