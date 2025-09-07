package Loops;
import java.util.Scanner;
public class CompositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        //Storing boolean value for Prime & Composite No:
        int x = 0; // '0' means Prime.
        for (int i = 2; i <= n-1 ; i++) {
            if(n%i == 0) { // "i" is a factor of 'n'
                System.out.println("Composite Number");
                x = 1; //'1' means Composite.
                break; //loop is terminated here as condition is fulfilled
            }
        }
        if (n == 1) System.out.println("Neither Prime nor Composite");
       else if(x == 0) System.out.println("Prime Number");
    }
}
