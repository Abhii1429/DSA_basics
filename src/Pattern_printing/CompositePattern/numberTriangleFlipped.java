package Pattern_printing.CompositePattern;
import java.util.Scanner;
public class numberTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) { //row
            for (int j = 1; j <= n-i; j++) { //loop for Spaces/hashes
                System.out.print(" " +" ");
            }
            for (int j = 1; j <= i; j++) { //loop for Number(here)/Stars
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
