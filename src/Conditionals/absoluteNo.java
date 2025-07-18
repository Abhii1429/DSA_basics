package Conditionals;
import java.util.Scanner;
public class absoluteNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int n = sc.nextInt();
        int a = Math.abs(n);
        System.out.println("Absolute No : " +a);
     sc.close();    
    }
}
