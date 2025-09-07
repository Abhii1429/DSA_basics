package Pattern_printing.CompositePattern;
import java.util.Scanner;
public class starBridge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        for (int i = 1; i <=2*n-1 ; i++) { //stars in upper row
            System.out.print("*" +" ");
        }
        System.out.println();
        n--;
        for (int i =1 ; i <= n ; i++) { //stars
            for(int j =1; j<=n+1-i; j++){
                System.out.print("*"+" ");
            }
            for(int j =1; j<=2*i-1; j++){ //spaces
                System.out.print(" "+" ");
            }

            for(int j=1; j<= n+1-i; j++){ //stars
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
