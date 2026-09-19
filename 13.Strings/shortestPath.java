public class shortestPath {
    public static void main(String[] args){
        String path = "WNEENESENNN";
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){ // North
                y++;
            }
            else if(path.charAt(i)=='S'){ // South
                y--;
            }
            else if(path.charAt(i)=='W'){ // West
                x++;
            }
            else if(path.charAt(i)=='E'){ // East
                x--;
            }
        }
        //shortest distance between two points d=√((x_2-x_1)²+(y_2-y_1)²
        int x2 = x*x;//(x_2-x_1)²   :-> here initially x1=0 
        int y2 = y*y;//(y_2-y_1)²   :-> here initially y1=0
        float shortestDistance =(float) Math.sqrt(x2+y2);
        System.out.println(shortestDistance);
    }
}
