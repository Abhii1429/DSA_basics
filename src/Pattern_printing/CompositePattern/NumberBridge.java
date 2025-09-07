package Pattern_printing.CompositePattern;
import java.util.Scanner;
public class NumberBridge {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        for(int i =1; i <= 2*n-1; i++){
            System.out.print(i +" ");
        }
        System.out.println();
        n--;

        int nsp = 1;
        for (int i = 1; i <=n ; i++) { //row
            int a = 1; //starts every line with a=1
            for (int j = 1; j <= n+1-i; j++) { //number
                System.out.print(a++ +" ");
            }
            for (int j = 1; j <= nsp; j++) { //spaces
                System.out.print(" "+" ");
                a++; //very important step
            }
            nsp += 2; //imp part of space code
            for (int j = 1 ; j <= n+1-i ; j++) { //number
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
