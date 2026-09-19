import java.util.*;
public class totalPriceOfItem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();

        float total_price = pen + pencil + eraser;
        System.out.println(total_price);

        //total price after 18% GST
        float newPrice = total_price + (total_price * 0.18f);
        System.out.print(newPrice);
    }
}
