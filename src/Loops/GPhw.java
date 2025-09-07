package Loops;
import java.util.Scanner;
public class GPhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of terms 'n' of GP : ");
        int n = sc.nextInt();
        int a = -3;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= 4;
        }
    }
}
