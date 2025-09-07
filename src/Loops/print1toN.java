package Loops;
import java.util.Scanner;
public class print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number upto which you want to print : ");
        int n = sc.nextInt();
        for(int i =1; i<= n; i++) {
            System.out.print(i+ " ");
        }
    }
}
