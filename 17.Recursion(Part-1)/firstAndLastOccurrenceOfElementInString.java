public class firstAndLastOccurrenceOfElementInString {
    public static int start = -1;
    public static int last = -1;
    public static void firstANDLast(String str,char ch, int idx){
        if(idx==str.length()){
            System.out.println("first occurrence of '"+ch+"' is at :"+start);
            System.out.println("last occurrence of '"+ch+"' is at :"+last);
            return ;
        }
        if(str.charAt(idx)==ch){
            if(start==-1) start = idx;
            else last = idx;
        }
        firstANDLast(str, ch, idx+1);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        firstANDLast(str, 'a', 0);
    }
}
  