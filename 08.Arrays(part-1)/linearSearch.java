public class linearSearch {
    public static int linearsearch(int[] number,int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] number = {2,4,6,8,10,12,14,16};
        int  key = 10;
        
        int i = linearsearch(number,key);
        if(i==-1){
            System.out.println("key is not found");
        }else{
            System.out.println("key is found at index "+i);
        }
    }
}
