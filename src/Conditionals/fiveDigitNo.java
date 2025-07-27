package Conditionals;
import java.util.Scanner;
public class fiveDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
        if(n>9999 && n<100000)
            System.out.println("It is a 5 digit no.");
        else System.out.println("Not a 5 digit no.");
        sc.close();
    }
}
