public class threePointsOnLine {
    public static void main(String args[]){
        double x1=1,x2=2,x3=3,y1=1,y2=2,y3=3;
        double m1 = (y2-y1)/(x2-x1);//slope of a line formula
        double m2 = (y3-y2)/(x3-x2);//slope of a line formula

        if(m2==m1){
            System.out.print("points lies on same line");
        }else{
            System.out.print("points do not lies on same line");
        }
    }
}
