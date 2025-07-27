package Conditionals;
import java.util.Scanner;
public class profitLoss2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP : ");
        double cp = sc.nextDouble();
        System.out.print("Enter SP :");
        double sp = sc.nextDouble();

//        if(sp>cp) System.out.println("Profit");
//        else System.out.println("Loss");
        //It is following strictly condition..that's why if e;se is mot always useful;
        // thus we use multiple "if" condition.
        if(sp>cp) System.out.println("Profit");
        if(sp<cp) System.out.println("Loss");
        if(sp == cp) System.out.println("No Profit No loss.");
         sc.close();
    }
}
