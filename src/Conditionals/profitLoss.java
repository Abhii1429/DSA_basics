package Conditionals;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP : ");
        double cp = sc.nextDouble();
        System.out.print("Enter SP :");
        double sp = sc.nextDouble();
        if(sp - cp >= 0)//or SP>CP
         {
            System.out.println("Seller has made profit.");
            double p = sp-cp;//Profit
            System.out.println("Total profit earned is "+p);
            double p1 = ((sp-cp)/cp)*100;//Profit%
            System.out.println("Therefore, Profit % is "+p1);
        } else{
            System.out.println("Seller has incurred loss.");
            double l = cp-sp;//Loss
            System.out.println("Total loss earned is "+ l);
            double l1 = ((sp-cp)/cp)*100;//Loss%
            System.out.println("Therefore,Loss % is "+l1);
        }

    }
}
